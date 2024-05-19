# CoreFilesGetFiles200ResponseFilesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Author** | Pointer to **string** | File owner | [optional] [default to "null"]
**Component** | Pointer to **string** |  | [optional] [default to "null"]
**Contextid** | Pointer to **int32** |  | [optional] [default to null]
**Filearea** | Pointer to **string** |  | [optional] 
**Filename** | Pointer to **string** |  | [optional] 
**Filepath** | Pointer to **string** |  | [optional] 
**Filesize** | Pointer to **int32** | File size | [optional] [default to null]
**Isdir** | Pointer to **bool** |  | [optional] [default to null]
**Itemid** | Pointer to **int32** |  | [optional] 
**License** | Pointer to **string** | File license | [optional] [default to "null"]
**Timecreated** | Pointer to **int32** | Time created | [optional] [default to null]
**Timemodified** | Pointer to **int32** |  | [optional] 
**Url** | Pointer to **string** |  | [optional] 

## Methods

### NewCoreFilesGetFiles200ResponseFilesInner

`func NewCoreFilesGetFiles200ResponseFilesInner() *CoreFilesGetFiles200ResponseFilesInner`

NewCoreFilesGetFiles200ResponseFilesInner instantiates a new CoreFilesGetFiles200ResponseFilesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFilesGetFiles200ResponseFilesInnerWithDefaults

`func NewCoreFilesGetFiles200ResponseFilesInnerWithDefaults() *CoreFilesGetFiles200ResponseFilesInner`

NewCoreFilesGetFiles200ResponseFilesInnerWithDefaults instantiates a new CoreFilesGetFiles200ResponseFilesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAuthor

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetAuthor() string`

GetAuthor returns the Author field if non-nil, zero value otherwise.

### GetAuthorOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetAuthorOk() (*string, bool)`

GetAuthorOk returns a tuple with the Author field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthor

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetAuthor(v string)`

SetAuthor sets Author field to given value.

### HasAuthor

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasAuthor() bool`

HasAuthor returns a boolean if a field has been set.

### GetComponent

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetContextid

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetContextid(v int32)`

SetContextid sets Contextid field to given value.

### HasContextid

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasContextid() bool`

HasContextid returns a boolean if a field has been set.

### GetFilearea

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetFilearea() string`

GetFilearea returns the Filearea field if non-nil, zero value otherwise.

### GetFileareaOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetFileareaOk() (*string, bool)`

GetFileareaOk returns a tuple with the Filearea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilearea

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetFilearea(v string)`

SetFilearea sets Filearea field to given value.

### HasFilearea

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasFilearea() bool`

HasFilearea returns a boolean if a field has been set.

### GetFilename

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetFilename(v string)`

SetFilename sets Filename field to given value.

### HasFilename

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasFilename() bool`

HasFilename returns a boolean if a field has been set.

### GetFilepath

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetFilepath() string`

GetFilepath returns the Filepath field if non-nil, zero value otherwise.

### GetFilepathOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetFilepathOk() (*string, bool)`

GetFilepathOk returns a tuple with the Filepath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilepath

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetFilepath(v string)`

SetFilepath sets Filepath field to given value.

### HasFilepath

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasFilepath() bool`

HasFilepath returns a boolean if a field has been set.

### GetFilesize

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetFilesize() int32`

GetFilesize returns the Filesize field if non-nil, zero value otherwise.

### GetFilesizeOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetFilesizeOk() (*int32, bool)`

GetFilesizeOk returns a tuple with the Filesize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilesize

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetFilesize(v int32)`

SetFilesize sets Filesize field to given value.

### HasFilesize

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasFilesize() bool`

HasFilesize returns a boolean if a field has been set.

### GetIsdir

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetIsdir() bool`

GetIsdir returns the Isdir field if non-nil, zero value otherwise.

### GetIsdirOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetIsdirOk() (*bool, bool)`

GetIsdirOk returns a tuple with the Isdir field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsdir

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetIsdir(v bool)`

SetIsdir sets Isdir field to given value.

### HasIsdir

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasIsdir() bool`

HasIsdir returns a boolean if a field has been set.

### GetItemid

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetLicense

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetLicense() string`

GetLicense returns the License field if non-nil, zero value otherwise.

### GetLicenseOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetLicenseOk() (*string, bool)`

GetLicenseOk returns a tuple with the License field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLicense

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetLicense(v string)`

SetLicense sets License field to given value.

### HasLicense

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasLicense() bool`

HasLicense returns a boolean if a field has been set.

### GetTimecreated

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUrl

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreFilesGetFiles200ResponseFilesInner) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreFilesGetFiles200ResponseFilesInner) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *CoreFilesGetFiles200ResponseFilesInner) HasUrl() bool`

HasUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


