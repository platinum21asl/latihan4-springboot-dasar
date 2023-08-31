package com.techno.latihan4springbootdasar.controller

import com.techno.latihan4springbootdasar.domain.dto.request.*
import com.techno.latihan4springbootdasar.domain.dto.response.*
import com.techno.latihan4springbootdasar.service.CrudService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid


@RestController
@RequestMapping("/api")
class CrudController(
    private val crudService: CrudService
) {

    @GetMapping("/position")
    fun getAllPosition(): ResponseEntity<ResBaseDto<ArrayList<ResPositionDto>>> {

        val result = crudService.getAllDataPosition()

        return ResponseEntity.ok().body(result)
    }

    @GetMapping("/position/{uid}")
    fun getByUidPosition(@PathVariable("uid") uid: String): ResponseEntity<ResBaseDto<ResPositionDto>> {

        val result = crudService.getByIdPosition(uid)

        return ResponseEntity.ok().body(result)
    }

    @PostMapping("/position")
    fun createPosition(@Valid @RequestBody reqPositionDto: ReqPositionDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.insertPosition(reqPositionDto)

        return ResponseEntity.ok().body(result)
    }

    @PutMapping("/position/{uid}")
    fun updatePosition(@Valid @PathVariable("uid")uid: String, @RequestBody reqPositionDto: ReqPositionDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.updatePosition(reqPositionDto, uid)

        return ResponseEntity.ok().body(result)
    }

    @DeleteMapping("/position/{id}")
    fun deletePosition(@PathVariable("id") id: Int): ResponseEntity<ResBaseDto<Any>> {

        val result = crudService.deletePosition(id)

        return ResponseEntity.ok().body(result)
    }

    @GetMapping("/document_category")
    fun getAllDocumentCategory(): ResponseEntity<ResBaseDto<ArrayList<ResDocumentCategoryDto>>> {
        val result = crudService.getAllDataDocumentCategory()

        return ResponseEntity.ok().body(result)
    }

    @GetMapping("/document_category/{uid}")
    fun getByUidDocumentCategory(@PathVariable("uid") uid: String): ResponseEntity<ResBaseDto<ResDocumentCategoryDto>> {
        val result = crudService.getByIdDocumentCategory(uid)

        return ResponseEntity.ok().body(result)
    }

    @PostMapping("/document_category")
    fun createDocumentCategory(@Valid @RequestBody reqDocumentCategoryDto: ReqDocumentCategoryDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.insertDocumentCategory(reqDocumentCategoryDto)

        return ResponseEntity.ok().body(result)
    }

    @PutMapping("/document_category/{uid}")
    fun updateDocumentCategory(@Valid @PathVariable("uid")uid: String, @RequestBody reqDocumentCategoryDto: ReqDocumentCategoryDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.updateDocumentCategory(reqDocumentCategoryDto, uid)

        return ResponseEntity.ok().body(result)
    }

    @DeleteMapping("/document_category/{id}")
    fun deleteDocumentCategory(@PathVariable("id") id: Int): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.deleteDocumentCategory(id)

        return ResponseEntity.ok().body(result)
    }

    @GetMapping("/company")
    fun getAllCompany(): ResponseEntity<ResBaseDto<ArrayList<ResCompanyDto>>> {
        val result = crudService.getAllDataCompany()

        return ResponseEntity.ok().body(result)
    }

    @GetMapping("/company/{uid}")
    fun getByUidCompany(@PathVariable("uid") uid: String): ResponseEntity<ResBaseDto<ResCompanyDto>> {
        val result = crudService.getByIdCompany(uid)

        return ResponseEntity.ok().body(result)
    }

    @PostMapping("/company")
    fun createCompany(@Valid @RequestBody reqCompanyDto: ReqCompanyDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.insertCompany(reqCompanyDto)

        return ResponseEntity.ok().body(result)
    }

    @PutMapping("/company/{uid}")
    fun updateCompany(@Valid @PathVariable("uid")uid: String, @RequestBody reqCompanyDto: ReqCompanyDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.updateCompany(reqCompanyDto, uid)

        return ResponseEntity.ok().body(result)
    }

    @DeleteMapping("/company/{id}")
    fun deleteCompany(@PathVariable("id") id: Int): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.deleteCompany(id)

        return ResponseEntity.ok().body(result)
    }

    @GetMapping("/document")
    fun getAllDocument(): ResponseEntity<ResBaseDto<ArrayList<ResDocumentDto>>> {
        val result = crudService.getAllDataDocument()

        return ResponseEntity.ok().body(result)
    }

    @GetMapping("/document/{uid}")
    fun getDocumentByUid(@PathVariable("uid") uid: String): ResponseEntity<ResBaseDto<ResDocumentDto>> {
        val result = crudService.getByIdDocument(uid)

        return ResponseEntity.ok().body(result)
    }

    @PostMapping("/document")
    fun createDocument(@Valid @RequestBody reqDocumentDto: ReqDocumentDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.insertDocument(reqDocumentDto)

        return ResponseEntity.ok().body(result)
    }

    @PutMapping("/document/{uid}")
    fun updateDocument(@Valid @PathVariable("uid")uid: String, @RequestBody reqDocumentDto: ReqDocumentDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.updateDocument(reqDocumentDto, uid)

        return ResponseEntity.ok().body(result)
    }

    @DeleteMapping("/document/{id}")
    fun deleteDocument(@PathVariable("id") id: Int): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.deleteDocument(id)

        return ResponseEntity.ok().body(result)
    }

    @GetMapping("/users")
    fun getAllUsers(): ResponseEntity<ResBaseDto<ArrayList<ResUsersDto>>> {
        val result = crudService.getAllDataUsers()

        return ResponseEntity.ok().body(result)
    }

    @GetMapping("/users/{uid}")
    fun getByUidUsers(@PathVariable("uid") uid: String): ResponseEntity<ResBaseDto<ResUsersDto>> {

        val result = crudService.getByUidUsers(uid)

        return ResponseEntity.ok().body(result)
    }

    @PostMapping("/users")
    fun createUsers(@Valid @RequestBody reqUsersDto: ReqUsersDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.insertUsers(reqUsersDto)

        return ResponseEntity.ok().body(result)
    }

    @PutMapping("/users/{uid}")
    fun updateUsers(@Valid @PathVariable("uid")uid: String, reqUsersDto: ReqUsersDto): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.updateUsers(reqUsersDto, uid)

        return ResponseEntity.ok().body(result)
    }

    @DeleteMapping("/users/{id}")
    fun deleteUsers(@PathVariable("id") id: Int): ResponseEntity<ResBaseDto<Any>> {
        val result = crudService.deleteUsers(id)

        return ResponseEntity.ok().body(result)
    }

}