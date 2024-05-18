# CoreBackupGetAsyncBackupProgressRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Backupids** | **[]map[string]interface{}** |  | 
**Contextid** | **int32** | Context id | 

## Methods

### NewCoreBackupGetAsyncBackupProgressRequest

`func NewCoreBackupGetAsyncBackupProgressRequest(backupids []map[string]interface{}, contextid int32, ) *CoreBackupGetAsyncBackupProgressRequest`

NewCoreBackupGetAsyncBackupProgressRequest instantiates a new CoreBackupGetAsyncBackupProgressRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBackupGetAsyncBackupProgressRequestWithDefaults

`func NewCoreBackupGetAsyncBackupProgressRequestWithDefaults() *CoreBackupGetAsyncBackupProgressRequest`

NewCoreBackupGetAsyncBackupProgressRequestWithDefaults instantiates a new CoreBackupGetAsyncBackupProgressRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBackupids

`func (o *CoreBackupGetAsyncBackupProgressRequest) GetBackupids() []map[string]interface{}`

GetBackupids returns the Backupids field if non-nil, zero value otherwise.

### GetBackupidsOk

`func (o *CoreBackupGetAsyncBackupProgressRequest) GetBackupidsOk() (*[]map[string]interface{}, bool)`

GetBackupidsOk returns a tuple with the Backupids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBackupids

`func (o *CoreBackupGetAsyncBackupProgressRequest) SetBackupids(v []map[string]interface{})`

SetBackupids sets Backupids field to given value.


### GetContextid

`func (o *CoreBackupGetAsyncBackupProgressRequest) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreBackupGetAsyncBackupProgressRequest) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreBackupGetAsyncBackupProgressRequest) SetContextid(v int32)`

SetContextid sets Contextid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


