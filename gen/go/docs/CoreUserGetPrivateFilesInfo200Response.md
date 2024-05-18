# CoreUserGetPrivateFilesInfo200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filecount** | **int32** | Number of files in the area. | [default to null]
**Filesize** | **int32** | Total size of the files in the area. | [default to null]
**Filesizewithoutreferences** | **int32** | Total size of the area excluding file references | [default to null]
**Foldercount** | **int32** | Number of folders in the area. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreUserGetPrivateFilesInfo200Response

`func NewCoreUserGetPrivateFilesInfo200Response(filecount int32, filesize int32, filesizewithoutreferences int32, foldercount int32, ) *CoreUserGetPrivateFilesInfo200Response`

NewCoreUserGetPrivateFilesInfo200Response instantiates a new CoreUserGetPrivateFilesInfo200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserGetPrivateFilesInfo200ResponseWithDefaults

`func NewCoreUserGetPrivateFilesInfo200ResponseWithDefaults() *CoreUserGetPrivateFilesInfo200Response`

NewCoreUserGetPrivateFilesInfo200ResponseWithDefaults instantiates a new CoreUserGetPrivateFilesInfo200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilecount

`func (o *CoreUserGetPrivateFilesInfo200Response) GetFilecount() int32`

GetFilecount returns the Filecount field if non-nil, zero value otherwise.

### GetFilecountOk

`func (o *CoreUserGetPrivateFilesInfo200Response) GetFilecountOk() (*int32, bool)`

GetFilecountOk returns a tuple with the Filecount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilecount

`func (o *CoreUserGetPrivateFilesInfo200Response) SetFilecount(v int32)`

SetFilecount sets Filecount field to given value.


### GetFilesize

`func (o *CoreUserGetPrivateFilesInfo200Response) GetFilesize() int32`

GetFilesize returns the Filesize field if non-nil, zero value otherwise.

### GetFilesizeOk

`func (o *CoreUserGetPrivateFilesInfo200Response) GetFilesizeOk() (*int32, bool)`

GetFilesizeOk returns a tuple with the Filesize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilesize

`func (o *CoreUserGetPrivateFilesInfo200Response) SetFilesize(v int32)`

SetFilesize sets Filesize field to given value.


### GetFilesizewithoutreferences

`func (o *CoreUserGetPrivateFilesInfo200Response) GetFilesizewithoutreferences() int32`

GetFilesizewithoutreferences returns the Filesizewithoutreferences field if non-nil, zero value otherwise.

### GetFilesizewithoutreferencesOk

`func (o *CoreUserGetPrivateFilesInfo200Response) GetFilesizewithoutreferencesOk() (*int32, bool)`

GetFilesizewithoutreferencesOk returns a tuple with the Filesizewithoutreferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilesizewithoutreferences

`func (o *CoreUserGetPrivateFilesInfo200Response) SetFilesizewithoutreferences(v int32)`

SetFilesizewithoutreferences sets Filesizewithoutreferences field to given value.


### GetFoldercount

`func (o *CoreUserGetPrivateFilesInfo200Response) GetFoldercount() int32`

GetFoldercount returns the Foldercount field if non-nil, zero value otherwise.

### GetFoldercountOk

`func (o *CoreUserGetPrivateFilesInfo200Response) GetFoldercountOk() (*int32, bool)`

GetFoldercountOk returns a tuple with the Foldercount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFoldercount

`func (o *CoreUserGetPrivateFilesInfo200Response) SetFoldercount(v int32)`

SetFoldercount sets Foldercount field to given value.


### GetWarnings

`func (o *CoreUserGetPrivateFilesInfo200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreUserGetPrivateFilesInfo200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreUserGetPrivateFilesInfo200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreUserGetPrivateFilesInfo200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


