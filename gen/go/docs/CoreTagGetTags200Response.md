# CoreTagGetTags200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tags** | [**[]CoreTagGetTags200ResponseTagsInner**](CoreTagGetTags200ResponseTagsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreTagGetTags200Response

`func NewCoreTagGetTags200Response(tags []CoreTagGetTags200ResponseTagsInner, ) *CoreTagGetTags200Response`

NewCoreTagGetTags200Response instantiates a new CoreTagGetTags200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTags200ResponseWithDefaults

`func NewCoreTagGetTags200ResponseWithDefaults() *CoreTagGetTags200Response`

NewCoreTagGetTags200ResponseWithDefaults instantiates a new CoreTagGetTags200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTags

`func (o *CoreTagGetTags200Response) GetTags() []CoreTagGetTags200ResponseTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *CoreTagGetTags200Response) GetTagsOk() (*[]CoreTagGetTags200ResponseTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *CoreTagGetTags200Response) SetTags(v []CoreTagGetTags200ResponseTagsInner)`

SetTags sets Tags field to given value.


### GetWarnings

`func (o *CoreTagGetTags200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreTagGetTags200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreTagGetTags200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreTagGetTags200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


