package com.techno.latihan4springbootdasar.service

import com.techno.latihan4springbootdasar.domain.dto.request.*
import com.techno.latihan4springbootdasar.domain.dto.response.*

interface CrudService {

    fun getAllDataPosition(): ResBaseDto<ArrayList<ResPositionDto>>

    fun getByIdPosition(uid: String): ResBaseDto<ResPositionDto>

    fun insertPosition(reqPosition: ReqPositionDto): ResBaseDto<Any>

    fun updatePosition(reqPosition: ReqPositionDto, uid: String):ResBaseDto<Any>

    fun deletePosition(id: Int): ResBaseDto<Any>

    fun getAllDataDocumentCategory(): ResBaseDto<ArrayList<ResDocumentCategoryDto>>

    fun getByIdDocumentCategory(uid: String): ResBaseDto<ResDocumentCategoryDto>

    fun insertDocumentCategory(reqDocumentCategoryDto: ReqDocumentCategoryDto): ResBaseDto<Any>

    fun updateDocumentCategory(reqDocumentCategoryDto: ReqDocumentCategoryDto, uid: String): ResBaseDto<Any>

    fun deleteDocumentCategory(id: Int): ResBaseDto<Any>

    fun getAllDataCompany(): ResBaseDto<ArrayList<ResCompanyDto>>

    fun getByIdCompany(uid: String): ResBaseDto<ResCompanyDto>

    fun insertCompany(reqCompanyDto: ReqCompanyDto): ResBaseDto<Any>

    fun updateCompany(reqCompanyDto: ReqCompanyDto, uid: String): ResBaseDto<Any>

    fun deleteCompany(id: Int): ResBaseDto<Any>

    fun getAllDataDocument(): ResBaseDto<ArrayList<ResDocumentDto>>

    fun getByIdDocument(uid: String): ResBaseDto<ResDocumentDto>

    fun insertDocument(reqDocumentDto: ReqDocumentDto): ResBaseDto<Any>

    fun updateDocument(reqDocumentDto: ReqDocumentDto, uid: String): ResBaseDto<Any>

    fun deleteDocument(id: Int): ResBaseDto<Any>

    fun getAllDataUsers(): ResBaseDto<ArrayList<ResUsersDto>>

    fun getByUidUsers(uid: String): ResBaseDto<ResUsersDto>

    fun insertUsers(reqUsersDto: ReqUsersDto): ResBaseDto<Any>

    fun updateUsers(reqUsersDto: ReqUsersDto, uid: String): ResBaseDto<Any>

    fun deleteUsers(id: Int): ResBaseDto<Any>
}