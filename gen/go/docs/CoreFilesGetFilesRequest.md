# CoreFilesGetFilesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | component | 
**Contextid** | **int32** | context id Set to -1 to use contextlevel and instanceid. | [default to null]
**Contextlevel** | Pointer to **string** | The context level for the file location. | [optional] [default to "null"]
**Filearea** | **string** | file area | [default to "null"]
**Filename** | **string** | file name | [default to "null"]
**Filepath** | **string** | file path | [default to "null"]
**Instanceid** | Pointer to **int32** | The instance id for where the file is located. | [optional] [default to null]
**Itemid** | **int32** | associated id | 
**Modified** | Pointer to **int32** | timestamp to return files changed after this time. | [optional] [default to null]

## Methods

### NewCoreFilesGetFilesRequest

`func NewCoreFilesGetFilesRequest(component string, contextid int32, filearea string, filename string, filepath string, itemid int32, ) *CoreFilesGetFilesRequest`

NewCoreFilesGetFilesRequest instantiates a new CoreFilesGetFilesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFilesGetFilesRequestWithDefaults

`func NewCoreFilesGetFilesRequestWithDefaults() *CoreFilesGetFilesRequest`

NewCoreFilesGetFilesRequestWithDefaults instantiates a new CoreFilesGetFilesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreFilesGetFilesRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreFilesGetFilesRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreFilesGetFilesRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextid

`func (o *CoreFilesGetFilesRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreFilesGetFilesRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreFilesGetFilesRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetContextlevel

`func (o *CoreFilesGetFilesRequest) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreFilesGetFilesRequest) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreFilesGetFilesRequest) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.

### HasContextlevel

`func (o *CoreFilesGetFilesRequest) HasContextlevel() bool`

HasContextlevel returns a boolean if a field has been set.

### GetFilearea

`func (o *CoreFilesGetFilesRequest) GetFilearea() string`

GetFilearea returns the Filearea field if non-nil, zero value otherwise.

### GetFileareaOk

`func (o *CoreFilesGetFilesRequest) GetFileareaOk() (*string, bool)`

GetFileareaOk returns a tuple with the Filearea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilearea

`func (o *CoreFilesGetFilesRequest) SetFilearea(v string)`

SetFilearea sets Filearea field to given value.


### GetFilename

`func (o *CoreFilesGetFilesRequest) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *CoreFilesGetFilesRequest) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *CoreFilesGetFilesRequest) SetFilename(v string)`

SetFilename sets Filename field to given value.


### GetFilepath

`func (o *CoreFilesGetFilesRequest) GetFilepath() string`

GetFilepath returns the Filepath field if non-nil, zero value otherwise.

### GetFilepathOk

`func (o *CoreFilesGetFilesRequest) GetFilepathOk() (*string, bool)`

GetFilepathOk returns a tuple with the Filepath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilepath

`func (o *CoreFilesGetFilesRequest) SetFilepath(v string)`

SetFilepath sets Filepath field to given value.


### GetInstanceid

`func (o *CoreFilesGetFilesRequest) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreFilesGetFilesRequest) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreFilesGetFilesRequest) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *CoreFilesGetFilesRequest) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetItemid

`func (o *CoreFilesGetFilesRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreFilesGetFilesRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreFilesGetFilesRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.


### GetModified

`func (o *CoreFilesGetFilesRequest) GetModified() int32`

GetModified returns the Modified field if non-nil, zero value otherwise.

### GetModifiedOk

`func (o *CoreFilesGetFilesRequest) GetModifiedOk() (*int32, bool)`

GetModifiedOk returns a tuple with the Modified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModified

`func (o *CoreFilesGetFilesRequest) SetModified(v int32)`

SetModified sets Modified field to given value.

### HasModified

`func (o *CoreFilesGetFilesRequest) HasModified() bool`

HasModified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


