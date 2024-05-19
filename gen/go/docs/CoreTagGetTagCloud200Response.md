# CoreTagGetTagCloud200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tags** | [**[]CoreTagGetTagCloud200ResponseTagsInner**](CoreTagGetTagCloud200ResponseTagsInner.md) |  | 
**Tagscount** | **int32** | Number of tags returned. | [default to null]
**Totalcount** | **int32** | Total count of tags. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreTagGetTagCloud200Response

`func NewCoreTagGetTagCloud200Response(tags []CoreTagGetTagCloud200ResponseTagsInner, tagscount int32, totalcount int32, ) *CoreTagGetTagCloud200Response`

NewCoreTagGetTagCloud200Response instantiates a new CoreTagGetTagCloud200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTagCloud200ResponseWithDefaults

`func NewCoreTagGetTagCloud200ResponseWithDefaults() *CoreTagGetTagCloud200Response`

NewCoreTagGetTagCloud200ResponseWithDefaults instantiates a new CoreTagGetTagCloud200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTags

`func (o *CoreTagGetTagCloud200Response) GetTags() []CoreTagGetTagCloud200ResponseTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *CoreTagGetTagCloud200Response) GetTagsOk() (*[]CoreTagGetTagCloud200ResponseTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *CoreTagGetTagCloud200Response) SetTags(v []CoreTagGetTagCloud200ResponseTagsInner)`

SetTags sets Tags field to given value.


### GetTagscount

`func (o *CoreTagGetTagCloud200Response) GetTagscount() int32`

GetTagscount returns the Tagscount field if non-nil, zero value otherwise.

### GetTagscountOk

`func (o *CoreTagGetTagCloud200Response) GetTagscountOk() (*int32, bool)`

GetTagscountOk returns a tuple with the Tagscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTagscount

`func (o *CoreTagGetTagCloud200Response) SetTagscount(v int32)`

SetTagscount sets Tagscount field to given value.


### GetTotalcount

`func (o *CoreTagGetTagCloud200Response) GetTotalcount() int32`

GetTotalcount returns the Totalcount field if non-nil, zero value otherwise.

### GetTotalcountOk

`func (o *CoreTagGetTagCloud200Response) GetTotalcountOk() (*int32, bool)`

GetTotalcountOk returns a tuple with the Totalcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalcount

`func (o *CoreTagGetTagCloud200Response) SetTotalcount(v int32)`

SetTotalcount sets Totalcount field to given value.


### GetWarnings

`func (o *CoreTagGetTagCloud200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreTagGetTagCloud200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreTagGetTagCloud200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreTagGetTagCloud200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


