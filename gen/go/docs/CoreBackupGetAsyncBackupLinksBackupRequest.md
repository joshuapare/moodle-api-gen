# CoreBackupGetAsyncBackupLinksBackupRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Backupid** | **string** | Backup id | [default to "null"]
**Contextid** | **int32** | Context id | [default to null]
**Filename** | **string** | Backup filename | [default to "null"]

## Methods

### NewCoreBackupGetAsyncBackupLinksBackupRequest

`func NewCoreBackupGetAsyncBackupLinksBackupRequest(backupid string, contextid int32, filename string, ) *CoreBackupGetAsyncBackupLinksBackupRequest`

NewCoreBackupGetAsyncBackupLinksBackupRequest instantiates a new CoreBackupGetAsyncBackupLinksBackupRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBackupGetAsyncBackupLinksBackupRequestWithDefaults

`func NewCoreBackupGetAsyncBackupLinksBackupRequestWithDefaults() *CoreBackupGetAsyncBackupLinksBackupRequest`

NewCoreBackupGetAsyncBackupLinksBackupRequestWithDefaults instantiates a new CoreBackupGetAsyncBackupLinksBackupRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBackupid

`func (o *CoreBackupGetAsyncBackupLinksBackupRequest) GetBackupid() string`

GetBackupid returns the Backupid field if non-nil, zero value otherwise.

### GetBackupidOk

`func (o *CoreBackupGetAsyncBackupLinksBackupRequest) GetBackupidOk() (*string, bool)`

GetBackupidOk returns a tuple with the Backupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupid

`func (o *CoreBackupGetAsyncBackupLinksBackupRequest) SetBackupid(v string)`

SetBackupid sets Backupid field to given value.


### GetContextid

`func (o *CoreBackupGetAsyncBackupLinksBackupRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreBackupGetAsyncBackupLinksBackupRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreBackupGetAsyncBackupLinksBackupRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetFilename

`func (o *CoreBackupGetAsyncBackupLinksBackupRequest) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *CoreBackupGetAsyncBackupLinksBackupRequest) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *CoreBackupGetAsyncBackupLinksBackupRequest) SetFilename(v string)`

SetFilename sets Filename field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


