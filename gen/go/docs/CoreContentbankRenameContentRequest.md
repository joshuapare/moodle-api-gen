# CoreContentbankRenameContentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contentid** | **int32** | The content id to rename | [default to null]
**Name** | **string** | The new name for the content | 

## Methods

### NewCoreContentbankRenameContentRequest

`func NewCoreContentbankRenameContentRequest(contentid int32, name string, ) *CoreContentbankRenameContentRequest`

NewCoreContentbankRenameContentRequest instantiates a new CoreContentbankRenameContentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreContentbankRenameContentRequestWithDefaults

`func NewCoreContentbankRenameContentRequestWithDefaults() *CoreContentbankRenameContentRequest`

NewCoreContentbankRenameContentRequestWithDefaults instantiates a new CoreContentbankRenameContentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContentid

`func (o *CoreContentbankRenameContentRequest) GetContentid() int32`

GetContentid returns the Contentid field if non-nil, zero value otherwise.

### GetContentidOk

`func (o *CoreContentbankRenameContentRequest) GetContentidOk() (*int32, bool)`

GetContentidOk returns a tuple with the Contentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentid

`func (o *CoreContentbankRenameContentRequest) SetContentid(v int32)`

SetContentid sets Contentid field to given value.


### GetName

`func (o *CoreContentbankRenameContentRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreContentbankRenameContentRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreContentbankRenameContentRequest) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


