# API SPEC

# START API: position

## Create Entity: position

Request:
- Method: POST
- Endpoint: `/api/position`
- Header: 
  - Content-Type: application/json
  - Accept: application/json
- Body:

```json
{
  "name": "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get All Entity: position

Request:
- Method: GET
- Endpoint: `/api/position`
- Header:
    - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get Entity by UID: position

Request:
- Method: GET
- Endpoint: `/api/position/{uid}`
- Header:
  - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Update Entity by UID: position

Request:
- Method: PUT
- Endpoint: `/api/position/{uid}`
- Header:
    - Content-Type: application/json
    - Accept: application/json

- Body:

```json
{
  "name": "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Delete Entity: position

Request:
- Method: DELETE
- Endpoint: `/api/position/{uid}`
- Header:
  - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```
# END API: position


# START API: document_category


## Create Entity: document_category

Request:
- Method: POST
- Endpoint: `/api/document_category`
- Header:
    - Content-Type: application/json
    - Accept: application/json
- Body:

```json
{
  "name": "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get All Entity: document_category

Request:
- Method: GET
- Endpoint: `/api/document_category`
- Header:
    - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get Entity by UID: document_category

Request:
- Method: GET
- Endpoint: `/api/document_category/{uid}`
- Header:
    - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Update Entity by UID: document_category

Request:
- Method: PUT
- Endpoint: `/api/document_category/{uid}`
- Header:
    - Content-Type: application/json
    - Accept: application/json

- Body:

```json
{
  "name": "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Delete Entity: document_category

Request:
- Method: DELETE
- Endpoint: `/api/document_category/{uid}`
- Header:
    - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

# END API: document_category





[//]: # (Start API company)
# START API: company

## Create Entity: company

Request:
- Method: POST
- Endpoint: `/api/company`
- Header:
    - Content-Type: application/json
    - Accept: application/json
- Body:

```json
{
  "name": "string",
  "address" : "string",
  "email": "string",
  "telephone": "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get All Entity: company

Request:
- Method: GET
- Endpoint: `/api/company`
- Header:
    - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get Entity by UID: company

Request:
- Method: GET
- Endpoint: `/api/company/{uid}`
- Header:
    - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Update Entity by UID: company

Request:
- Method: PUT
- Endpoint: `/api/company/{uid}`
- Header:
    - Content-Type: application/json
    - Accept: application/json

- Body:

```json
{
  "name": "string",
  "address" : "string",
  "email": "string",
  "telephone": "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Delete Entity: company

Request:
- Method: DELETE
- Endpoint: `/api/company/{uid}`
- Header:
    - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

# END API: company
[//]: # (End API company)

# START API: document

## Create Entity: document

Request:
- Method: POST
- Endpoint: `/api/ document`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:

```json
{
  "idCompany": "int",
  "idCategory": "int",
  "name": "string",
  "description" : "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idCategory": "int",
    "name": "string",
    "description" : "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get All Entity: document

Request:
- Method: GET
- Endpoint: `/api/document`
- Header:
  - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idCategory": "int",
    "name": "string",
    "description" : "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get Entity by UID: company

Request:
- Method: GET
- Endpoint: `/api/document/{uid}`
- Header:
  - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idCategory": "int",
    "name": "string",
    "description" : "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Update Entity by UID: document

Request:
- Method: PUT
- Endpoint: `/api/document/{uid}`
- Header:
  - Content-Type: application/json
  - Accept: application/json

- Body:

```json
{
  "id": "int, unique",
  "idCompany": "int",
  "idCategory": "int",
  "name": "string",
  "description" : "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idCategory": "int",
    "name": "string",
    "description" : "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Delete Entity: document

Request:
- Method: DELETE
- Endpoint: `/api/document/{uid}`
- Header:
  - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idCategory": "int",
    "name": "string",
    "description" : "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

# END API: document

# START API: user

## Create Entity: user

Request:
- Method: POST
- Endpoint: `/api/user`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:

```json
{
  "idCompany": "int",
  "idPosition": "int",
  "name": "string",
  "address" : "string",
  "email": "string",
  "telephone": "string",
  "username": "string",
  "password": "string",
  "role": "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idPosition": "int",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "username": "string",
    "password": "string",
    "role": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get All Entity: user

Request:
- Method: GET
- Endpoint: `/api/user`
- Header:
  - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idPosition": "int",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "username": "string",
    "password": "string",
    "role": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Get Entity by UID: user

Request:
- Method: GET
- Endpoint: `/api/user/{uid}`
- Header:
  - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idPosition": "int",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "username": "string",
    "password": "string",
    "role": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Update Entity by UID: user

Request:
- Method: PUT
- Endpoint: `/api/user/{uid}`
- Header:
  - Content-Type: application/json
  - Accept: application/json

- Body:

```json
{
  "idCompany": "int",
  "idPosition": "int",
  "name": "string",
  "address" : "string",
  "email": "string",
  "telephone": "string",
  "username": "string",
  "password": "string",
  "role": "string"
}
```
Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idPosition": "int",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "username": "string",
    "password": "string",
    "role": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

## Delete Entity: company

Request:
- Method: DELETE
- Endpoint: `/api/company/{uid}`
- Header:
  - Accept: application/json

Response:
```json
{
  "status": "true",
  "message": "Success",
  "data": {
    "id": "int, unique",
    "uid": "string",
    "idCompany": "int",
    "idPosition": "int",
    "name": "string",
    "address" : "string",
    "email": "string",
    "telephone": "string",
    "username": "string",
    "password": "string",
    "role": "string",
    "createAt": "timestamp",
    "updateAt": "timestamp"
  },
  "code": "200",
  "error": "null"
}
```

# END API: user

