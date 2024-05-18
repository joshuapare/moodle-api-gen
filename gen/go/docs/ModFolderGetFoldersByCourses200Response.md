# ModFolderGetFoldersByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Folders** | [**[]ModFolderGetFoldersByCourses200ResponseFoldersInner**](ModFolderGetFoldersByCourses200ResponseFoldersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFolderGetFoldersByCourses200Response

`func NewModFolderGetFoldersByCourses200Response(folders []ModFolderGetFoldersByCourses200ResponseFoldersInner, ) *ModFolderGetFoldersByCourses200Response`

NewModFolderGetFoldersByCourses200Response instantiates a new ModFolderGetFoldersByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFolderGetFoldersByCourses200ResponseWithDefaults

`func NewModFolderGetFoldersByCourses200ResponseWithDefaults() *ModFolderGetFoldersByCourses200Response`

NewModFolderGetFoldersByCourses200ResponseWithDefaults instantiates a new ModFolderGetFoldersByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFolders

`func (o *ModFolderGetFoldersByCourses200Response) GetFolders() []ModFolderGetFoldersByCourses200ResponseFoldersInner`

GetFolders returns the Folders field if non-nil, zero value otherwise.

### GetFoldersOk

`func (o *ModFolderGetFoldersByCourses200Response) GetFoldersOk() (*[]ModFolderGetFoldersByCourses200ResponseFoldersInner, bool)`

GetFoldersOk returns a tuple with the Folders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFolders

`func (o *ModFolderGetFoldersByCourses200Response) SetFolders(v []ModFolderGetFoldersByCourses200ResponseFoldersInner)`

SetFolders sets Folders field to given value.


### GetWarnings

`func (o *ModFolderGetFoldersByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFolderGetFoldersByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFolderGetFoldersByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFolderGetFoldersByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


