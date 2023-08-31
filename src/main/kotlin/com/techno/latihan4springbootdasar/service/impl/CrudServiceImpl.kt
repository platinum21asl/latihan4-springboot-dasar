package com.techno.latihan4springbootdasar.service.impl

import com.techno.latihan4springbootdasar.domain.dto.request.*
import com.techno.latihan4springbootdasar.domain.dto.response.*
import com.techno.latihan4springbootdasar.domain.entity.*
import com.techno.latihan4springbootdasar.exception.CustomExceptionHandler
import com.techno.latihan4springbootdasar.repository.*
import com.techno.latihan4springbootdasar.service.CrudService
import org.mindrot.jbcrypt.BCrypt
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList


@Service
class CrudServiceImpl(
    private val repositoryPosition: RepositoryPosition,
    private val repositoryDocumentCategory: RepositoryDocumentCategory,
    private val repositoryCompany: RepositoryCompany,
    private val repositoryDocument: RepositoryDocument,
    private val repositoryUsers: RepositoryUsers,

    ) : CrudService {
    override fun getAllDataPosition(): ResBaseDto<ArrayList<ResPositionDto>> {
        val data = repositoryPosition.findAll()

        if (data.isEmpty()) {
            return ResBaseDto(false, "Data is Empty", null)
        }

        val response: ArrayList<ResPositionDto> = ArrayList()

        data.forEach {
            response.add(
                ResPositionDto(
                    id = it.id!!,
                    uid = it.uid!!,
                    name = it.name!!,
                    createdAt = it.createdAt!!,
                    updatedAt = it.updatedAt!!
                )
            )
        }

        return ResBaseDto(data = response)
    }

    override fun getByIdPosition(uid: String): ResBaseDto<ResPositionDto> {
        val data = findByUidPosition(uid)

        val response = responsePosition(data)

        return ResBaseDto(data = response)
    }

    override fun insertPosition(reqPosition: ReqPositionDto): ResBaseDto<Any> {
        val uid = UUID.randomUUID().toString()
        val data = EntityPosition(
            uid = uid,
            name = reqPosition.name!!,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryPosition.save(data)

        val response = responsePosition(entity)

        return ResBaseDto(data = response)
    }

    override fun updatePosition(reqPosition: ReqPositionDto, uid: String): ResBaseDto<Any> {
        val data = findByUidPosition(uid)

        val newData = data.copy(
            name = reqPosition.name!!,
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryPosition.save(newData)

        val response = responsePosition(entity)

        return ResBaseDto(data = response)
    }

    override fun deletePosition(id: Int): ResBaseDto<Any> {
        repositoryPosition.findById(id) ?: throw CustomExceptionHandler("Position not found")

        repositoryPosition.deleteId(id)

        return ResBaseDto(data = null)
    }

    override fun getAllDataDocumentCategory(): ResBaseDto<ArrayList<ResDocumentCategoryDto>> {
        val data = repositoryDocumentCategory.findAll()

        if (data.isEmpty()) {
            return ResBaseDto(false, "Data is Empty", null)
        }

        val response: ArrayList<ResDocumentCategoryDto> = ArrayList()

        data.forEach {
            response.add(
                ResDocumentCategoryDto(
                    id = it.id!!,
                    uid = it.uid!!,
                    name = it.name!!,
                    createdAt = it.createdAt!!,
                    updatedAt = it.updatedAt!!
                )
            )
        }

        return ResBaseDto(data = response)
    }

    override fun getByIdDocumentCategory(uid: String): ResBaseDto<ResDocumentCategoryDto> {
        val data = findByUidDocumentCategory(uid)

        val response = responseDocumentCategory(data)

        return ResBaseDto(data = response)
    }

    override fun insertDocumentCategory(reqDocumentCategoryDto: ReqDocumentCategoryDto): ResBaseDto<Any> {
        val uid = UUID.randomUUID().toString()
        val data = EntityDocumentCategory(
            uid = uid,
            name = reqDocumentCategoryDto.name!!,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryDocumentCategory.save(data)

        val response = responseDocumentCategory(entity)

        return ResBaseDto(data = response)
    }

    override fun updateDocumentCategory(reqDocumentCategoryDto: ReqDocumentCategoryDto, uid: String): ResBaseDto<Any> {
        val data = findByUidDocumentCategory(uid)

        val newData = data.copy(
            name = reqDocumentCategoryDto.name!!,
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryDocumentCategory.save(newData)

        val response = responseDocumentCategory(entity)

        return ResBaseDto(data = response)
    }

    override fun deleteDocumentCategory(id: Int): ResBaseDto<Any> {
        repositoryDocumentCategory.findById(id) ?: throw CustomExceptionHandler("Document Category not found")

        repositoryDocumentCategory.deleteId(id)

        return ResBaseDto(data = null)
    }

    override fun getAllDataCompany(): ResBaseDto<ArrayList<ResCompanyDto>> {
        val data = repositoryCompany.findAll()

        if (data.isEmpty()) {
            return ResBaseDto(false, "Data is Empty", null)
        }

        val response: ArrayList<ResCompanyDto> = ArrayList()

        data.forEach {
            response.add(
                ResCompanyDto(
                    id = it.id!!,
                    uid = it.uid!!,
                    name = it.name!!,
                    address = it.address!!,
                    email = it.email!!,
                    telephone = it.telephone!!,
                    createdAt = it.createdAt!!,
                    updatedAt = it.updatedAt!!
                )
            )
        }

        return ResBaseDto(data = response)
    }

    override fun getByIdCompany(uid: String): ResBaseDto<ResCompanyDto> {
        val data = findByUidCompany(uid)

        val response = responseCompany(data)

        return ResBaseDto(data = response)
    }

    override fun insertCompany(reqCompanyDto: ReqCompanyDto): ResBaseDto<Any> {
        val uid = UUID.randomUUID().toString()
        val data = EntityCompany(
            uid = uid,
            name = reqCompanyDto.name,
            address = reqCompanyDto.address!!,
            email = reqCompanyDto.email,
            telephone = reqCompanyDto.telephone!!,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryCompany.save(data)

        val response = responseCompany(entity)

        return ResBaseDto(data = response)
    }

    override fun updateCompany(reqCompanyDto: ReqCompanyDto, uid: String): ResBaseDto<Any> {
        val data = findByUidCompany(uid)

        val newData = data.copy(
            name = reqCompanyDto.name,
            address = reqCompanyDto.address,
            email = reqCompanyDto.email,
            telephone = reqCompanyDto.telephone,
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryCompany.save(newData)

        val response = responseCompany(entity)

        return ResBaseDto(data = response)
    }

    override fun deleteCompany(id: Int): ResBaseDto<Any> {
        repositoryCompany.findById(id) ?: throw CustomExceptionHandler("Company not found")
        repositoryCompany.deleteId(id)

        return ResBaseDto(data = null)
    }

    override fun getAllDataDocument(): ResBaseDto<ArrayList<ResDocumentDto>> {
        val data = repositoryDocument.findAll()

        if (data.isEmpty()) {
            return ResBaseDto(false, "Data is Empty", null)
        }
        val response: ArrayList<ResDocumentDto> = ArrayList()

        data.forEach {
            response.add(
                ResDocumentDto(
                    id = it.id!!,
                    uid = it.uid!!,
                    nameCompany = it.idCompany?.name!!,
                    nameCategory = it.idCategory?.name!!,
                    name = it.name!!,
                    description = it.description!!,
                    createdAt = it.createdAt!!,
                    updatedAt = it.updatedAt!!
                )
            )
        }

        return ResBaseDto(data = response)
    }

    override fun getByIdDocument(uid: String): ResBaseDto<ResDocumentDto> {
        val data = findByUidDocument(uid)

        val response = responseDocument(data)

        return ResBaseDto(data = response)
    }

    override fun insertDocument(reqDocumentDto: ReqDocumentDto): ResBaseDto<Any> {
        val uid = UUID.randomUUID().toString()

        val dataEntityCompany = repositoryCompany.findById(reqDocumentDto.idCompany)
            ?: throw CustomExceptionHandler("Entity Company not found")
        val dataEntityCategory = repositoryDocumentCategory.findById(reqDocumentDto.idCategory)
            ?: throw CustomExceptionHandler("Entity Category not found")


        val data = EntityDocument(
            uid = uid,
            idCompany = dataEntityCompany,
            idCategory = dataEntityCategory,
            name = reqDocumentDto.name,
            description = reqDocumentDto.description!!,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryDocument.save(data)

        val response = responseDocument(entity)

        return ResBaseDto(data = response)
    }

    override fun updateDocument(reqDocumentDto: ReqDocumentDto, uid: String): ResBaseDto<Any> {
        val data = findByUidDocument(uid)

        val dataEntityCompany = repositoryCompany.findById(reqDocumentDto.idCompany)
            ?: throw CustomExceptionHandler("Entity Company not found")
        val dataEntityCategory = repositoryDocumentCategory.findById(reqDocumentDto.idCategory)
            ?: throw CustomExceptionHandler("Entity Category not found")


        val newData = data.copy(
            idCompany = dataEntityCompany,
            idCategory = dataEntityCategory,
            name = reqDocumentDto.name,
            description = reqDocumentDto.description!!,
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryDocument.save(newData)

        val response = responseDocument(entity)

        return ResBaseDto(data = response)
    }

    override fun deleteDocument(id: Int): ResBaseDto<Any> {
        repositoryDocument.findById(id) ?: throw CustomExceptionHandler("Document not found")
        repositoryDocument.deleteId(id)

        return ResBaseDto(data = null)
    }

    override fun getAllDataUsers(): ResBaseDto<ArrayList<ResUsersDto>> {
        val data = repositoryUsers.findAll()

        if (data.isEmpty()) {
            return ResBaseDto(false, "Data is Empty", null)
        }
        val response: ArrayList<ResUsersDto> = ArrayList()

        data.forEach {
            response.add(
                ResUsersDto(
                    id = it.id!!,
                    uid = it.uid!!,
                    nameCompany = it.idCompany?.name!!,
                    namePosition = it.idPosition?.name!!,
                    name = it.name!!,
                    address = it.address!!,
                    email = it.email!!,
                    telephone = it.telephone!!,
                    username = it.username!!,
                    role = it.role!!,
                    createdAt = it.createdAt!!,
                    updatedAt = it.updatedAt!!
                )
            )
        }

        return ResBaseDto(data = response)
    }

    override fun getByUidUsers(uid: String): ResBaseDto<ResUsersDto> {
        val data = findByUidUsers(uid)

        val response = responseUsers(data)

        return ResBaseDto(data = response)
    }

    override fun insertUsers(reqUsersDto: ReqUsersDto): ResBaseDto<Any> {
        val uid = UUID.randomUUID().toString()

        val dataEntityCompany = repositoryCompany.findById(reqUsersDto.idCompany)
            ?: throw CustomExceptionHandler("Entity Company not found")
        val dataEntityPosition = repositoryPosition.findById(reqUsersDto.idPosition)
            ?: throw CustomExceptionHandler("Entity Position not found")


        val salt = BCrypt.gensalt()

        val data = EntityUsers(
            uid = uid,
            idCompany = dataEntityCompany,
            idPosition = dataEntityPosition,
            name = reqUsersDto.name,
            address = reqUsersDto.address,
            email = reqUsersDto.email,
            telephone = reqUsersDto.telephone,
            username = reqUsersDto.username,
            password = BCrypt.hashpw(reqUsersDto.password, salt),
            role = reqUsersDto.role,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryUsers.save(data)

        val response = responseUsers(entity)

        return ResBaseDto(data = response)
    }

    override fun updateUsers(reqUsersDto: ReqUsersDto, uid: String): ResBaseDto<Any> {
        val data = findByUidUsers(uid)

        val dataEntityCompany = repositoryCompany.findById(reqUsersDto.idCompany)
            ?: throw CustomExceptionHandler("Entity Company not found")
        val dataEntityPosition = repositoryPosition.findById(reqUsersDto.idPosition)
            ?: throw CustomExceptionHandler("Entity Position not found")

        val salt = BCrypt.gensalt()

        val newData = data.copy(
            idCompany = dataEntityCompany,
            idPosition = dataEntityPosition,
            name = reqUsersDto.name,
            address = reqUsersDto.address,
            email = reqUsersDto.email,
            telephone = reqUsersDto.telephone,
            username = reqUsersDto.username,
            password = BCrypt.hashpw(reqUsersDto.password, salt),
            updatedAt = LocalDateTime.now()
        )

        val entity = repositoryUsers.save(newData)

        val response = responseUsers(entity)

        return ResBaseDto(data = response)
    }

    override fun deleteUsers(id: Int): ResBaseDto<Any> {
        repositoryUsers.findById(id) ?: throw CustomExceptionHandler("Users not found")

        repositoryUsers.deleteId(id)

        return ResBaseDto(data = null)
    }

    private fun responsePosition(entityPosition: EntityPosition): ResPositionDto {
        return ResPositionDto(
            id = entityPosition.id!!,
            uid = entityPosition.uid!!,
            name = entityPosition.name!!,
            createdAt = entityPosition.createdAt!!,
            updatedAt = entityPosition.updatedAt!!
        )
    }

    private fun responseDocumentCategory(entityDocumentCategory: EntityDocumentCategory): ResDocumentCategoryDto {
        return ResDocumentCategoryDto(
            id = entityDocumentCategory.id!!,
            uid = entityDocumentCategory.uid!!,
            name = entityDocumentCategory.name!!,
            createdAt = entityDocumentCategory.createdAt!!,
            updatedAt = entityDocumentCategory.updatedAt!!
        )
    }

    private fun responseCompany(entityCompany: EntityCompany): ResCompanyDto {
        return ResCompanyDto(

            id = entityCompany.id!!,
            uid = entityCompany.uid!!,
            name = entityCompany.name!!,
            address = entityCompany.address!!,
            email = entityCompany.email!!,
            telephone = entityCompany.telephone!!,
            createdAt = entityCompany.createdAt!!,
            updatedAt = entityCompany.updatedAt!!

        )
    }

    private fun responseDocument(entityDocument: EntityDocument): ResDocumentDto {
        return ResDocumentDto(
            id = entityDocument.id!!,
            uid = entityDocument.uid!!,
            nameCategory = entityDocument.idCategory?.name!!,
            nameCompany = entityDocument.idCompany?.name!!,
            name = entityDocument.name!!,
            description = entityDocument.description!!,
            createdAt = entityDocument.createdAt!!,
            updatedAt = entityDocument.updatedAt!!
        )
    }

    private fun responseUsers(entityUsers: EntityUsers): ResUsersDto {
        return ResUsersDto(
            id = entityUsers.id!!,
            uid = entityUsers.uid!!,
            nameCompany = entityUsers.idCompany?.name!!,
            namePosition = entityUsers.idPosition?.name!!,
            name = entityUsers.name!!,
            address = entityUsers.address!!,
            email = entityUsers.email!!,
            telephone = entityUsers.telephone!!,
            username = entityUsers.username!!,
            role = entityUsers.role!!,
            createdAt = entityUsers.createdAt!!,
            updatedAt = entityUsers.updatedAt!!
        )
    }

    private fun findByUidPosition(uid: String): EntityPosition {
        val data = repositoryPosition.findByUid(uid)

        if (data == null) {
            throw CustomExceptionHandler("UID not found")
        } else {
            return data
        }
    }

    private fun findByUidDocumentCategory(uid: String): EntityDocumentCategory {
        val data = repositoryDocumentCategory.findByUid(uid)

        if (data == null) {
            throw CustomExceptionHandler("UID not found")
        } else {
            return data
        }
    }

    private fun findByUidCompany(uid: String): EntityCompany {
        val data = repositoryCompany.findByUid(uid)

        if (data == null) {
            throw CustomExceptionHandler("UID not found")
        } else {
            return data
        }
    }

    private fun findByUidDocument(uid: String): EntityDocument {
        val data = repositoryDocument.findByUid(uid)
        if (data == null) {
            throw CustomExceptionHandler("UID not found")
        } else {
            return data
        }
    }

    private fun findByUidUsers(uid: String): EntityUsers {
        val data = repositoryUsers.findByUid(uid)
        if (data == null) {
            throw CustomExceptionHandler("UID not found")
        } else {
            return data
        }
    }
}