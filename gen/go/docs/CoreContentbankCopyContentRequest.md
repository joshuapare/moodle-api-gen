# CoreContentbankCopyContentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contentid** | **int32** | The content id to copy | [default to null]
**Name** | **string** | The new name for the content | [default to "null"]

## Methods

### NewCoreContentbankCopyContentRequest

`func NewCoreContentbankCopyContentRequest(contentid int32, name string, ) *CoreContentbankCopyContentRequest`

NewCoreContentbankCopyContentRequest instantiates a new CoreContentbankCopyContentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreContentbankCopyContentRequestWithDefaults

`func NewCoreContentbankCopyContentRequestWithDefaults() *CoreContentbankCopyContentRequest`

NewCoreContentbankCopyContentRequestWithDefaults instantiates a new CoreContentbankCopyContentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContentid

`func (o *CoreContentbankCopyContentRequest) GetContentid() int32`

GetContentid returns the Contentid field if non-nil, zero value otherwise.

### GetContentidOk

`func (o *CoreContentbankCopyContentRequest) GetContentidOk() (*int32, bool)`

GetContentidOk returns a tuple with the Contentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentid

`func (o *CoreContentbankCopyContentRequest) SetContentid(v int32)`

SetContentid sets Contentid field to given value.


### GetName

`func (o *CoreContentbankCopyContentRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreContentbankCopyContentRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreContentbankCopyContentRequest) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


