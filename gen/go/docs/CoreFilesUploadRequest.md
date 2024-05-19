# CoreFilesUploadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | component | 
**Contextid** | Pointer to **int32** | context id | [optional] [default to null]
**Contextlevel** | Pointer to **string** | The context level to put the file in,                         (block, course, coursecat, system, user, module) | [optional] [default to "null"]
**Filearea** | **string** | file area | 
**Filecontent** | **string** | file content | [default to "null"]
**Filename** | **string** | file name | 
**Filepath** | **string** | file path | 
**Instanceid** | Pointer to **int32** | The Instance id of item associated                          with the context level | [optional] [default to null]
**Itemid** | **int32** | associated id | 

## Methods

### NewCoreFilesUploadRequest

`func NewCoreFilesUploadRequest(component string, filearea string, filecontent string, filename string, filepath string, itemid int32, ) *CoreFilesUploadRequest`

NewCoreFilesUploadRequest instantiates a new CoreFilesUploadRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFilesUploadRequestWithDefaults

`func NewCoreFilesUploadRequestWithDefaults() *CoreFilesUploadRequest`

NewCoreFilesUploadRequestWithDefaults instantiates a new CoreFilesUploadRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreFilesUploadRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreFilesUploadRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreFilesUploadRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextid

`func (o *CoreFilesUploadRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreFilesUploadRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreFilesUploadRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreFilesUploadRequest) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetContextlevel

`func (o *CoreFilesUploadRequest) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreFilesUploadRequest) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreFilesUploadRequest) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreFilesUploadRequest) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetFilearea

`func (o *CoreFilesUploadRequest) GetFilearea() string`

GetFilearea returns the Filearea field if non-nil, zero value otherwise.

### GetFileareaOk

`func (o *CoreFilesUploadRequest) GetFileareaOk() (*string, bool)`

GetFileareaOk returns a tuple with the Filearea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilearea

`func (o *CoreFilesUploadRequest) SetFilearea(v string)`

SetFilearea sets Filearea field to given value.


### GetFilecontent

`func (o *CoreFilesUploadRequest) GetFilecontent() string`

GetFilecontent returns the Filecontent field if non-nil, zero value otherwise.

### GetFilecontentOk

`func (o *CoreFilesUploadRequest) GetFilecontentOk() (*string, bool)`

GetFilecontentOk returns a tuple with the Filecontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilecontent

`func (o *CoreFilesUploadRequest) SetFilecontent(v string)`

SetFilecontent sets Filecontent field to given value.


### GetFilename

`func (o *CoreFilesUploadRequest) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *CoreFilesUploadRequest) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *CoreFilesUploadRequest) SetFilename(v string)`

SetFilename sets Filename field to given value.


### GetFilepath

`func (o *CoreFilesUploadRequest) GetFilepath() string`

GetFilepath returns the Filepath field if non-nil, zero value otherwise.

### GetFilepathOk

`func (o *CoreFilesUploadRequest) GetFilepathOk() (*string, bool)`

GetFilepathOk returns a tuple with the Filepath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilepath

`func (o *CoreFilesUploadRequest) SetFilepath(v string)`

SetFilepath sets Filepath field to given value.


### GetInstanceid

`func (o *CoreFilesUploadRequest) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreFilesUploadRequest) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreFilesUploadRequest) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreFilesUploadRequest) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetItemid

`func (o *CoreFilesUploadRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreFilesUploadRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreFilesUploadRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


