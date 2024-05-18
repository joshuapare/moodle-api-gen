# CoreContentbankSetContentVisibilityRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contentid** | **int32** | The content id to rename | 
**Visibility** | **int32** | The new visibility for the content | [default to null]

## Methods

### NewCoreContentbankSetContentVisibilityRequest

`func NewCoreContentbankSetContentVisibilityRequest(contentid int32, visibility int32, ) *CoreContentbankSetContentVisibilityRequest`

NewCoreContentbankSetContentVisibilityRequest instantiates a new CoreContentbankSetContentVisibilityRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreContentbankSetContentVisibilityRequestWithDefaults

`func NewCoreContentbankSetContentVisibilityRequestWithDefaults() *CoreContentbankSetContentVisibilityRequest`

NewCoreContentbankSetContentVisibilityRequestWithDefaults instantiates a new CoreContentbankSetContentVisibilityRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContentid

`func (o *CoreContentbankSetContentVisibilityRequest) GetContentid() int32`

GetContentid returns the Contentid field if non-nil, zero value otherwise.

### GetContentidOk

`func (o *CoreContentbankSetContentVisibilityRequest) GetContentidOk() (*int32, bool)`

GetContentidOk returns a tuple with the Contentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentid

`func (o *CoreContentbankSetContentVisibilityRequest) SetContentid(v int32)`

SetContentid sets Contentid field to given value.


### GetVisibility

`func (o *CoreContentbankSetContentVisibilityRequest) GetVisibility() int32`

GetVisibility returns the Visibility field if non-nil, zero value otherwise.

### GetVisibilityOk

`func (o *CoreContentbankSetContentVisibilityRequest) GetVisibilityOk() (*int32, bool)`

GetVisibilityOk returns a tuple with the Visibility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibility

`func (o *CoreContentbankSetContentVisibilityRequest) SetVisibility(v int32)`

SetVisibility sets Visibility field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


