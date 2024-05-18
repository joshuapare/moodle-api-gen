# CoreFilesDeleteDraftFilesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Draftitemid** | **int32** | Item id of the draft file area | [default to null]
**Files** | [**[]CoreFilesDeleteDraftFilesRequestFilesInner**](CoreFilesDeleteDraftFilesRequestFilesInner.md) |  | 

## Methods

### NewCoreFilesDeleteDraftFilesRequest

`func NewCoreFilesDeleteDraftFilesRequest(draftitemid int32, files []CoreFilesDeleteDraftFilesRequestFilesInner, ) *CoreFilesDeleteDraftFilesRequest`

NewCoreFilesDeleteDraftFilesRequest instantiates a new CoreFilesDeleteDraftFilesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFilesDeleteDraftFilesRequestWithDefaults

`func NewCoreFilesDeleteDraftFilesRequestWithDefaults() *CoreFilesDeleteDraftFilesRequest`

NewCoreFilesDeleteDraftFilesRequestWithDefaults instantiates a new CoreFilesDeleteDraftFilesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDraftitemid

`func (o *CoreFilesDeleteDraftFilesRequest) GetDraftitemid() int32`

GetDraftitemid returns the Draftitemid field if non-nil, zero value otherwise.

### GetDraftitemidOk

`func (o *CoreFilesDeleteDraftFilesRequest) GetDraftitemidOk() (*int32, bool)`

GetDraftitemidOk returns a tuple with the Draftitemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraftitemid

`func (o *CoreFilesDeleteDraftFilesRequest) SetDraftitemid(v int32)`

SetDraftitemid sets Draftitemid field to given value.


### GetFiles

`func (o *CoreFilesDeleteDraftFilesRequest) GetFiles() []CoreFilesDeleteDraftFilesRequestFilesInner`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *CoreFilesDeleteDraftFilesRequest) GetFilesOk() (*[]CoreFilesDeleteDraftFilesRequestFilesInner, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *CoreFilesDeleteDraftFilesRequest) SetFiles(v []CoreFilesDeleteDraftFilesRequestFilesInner)`

SetFiles sets Files field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


