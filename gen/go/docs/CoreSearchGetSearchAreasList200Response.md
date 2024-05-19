# CoreSearchGetSearchAreasList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Areas** | [**[]CoreSearchGetSearchAreasList200ResponseAreasInner**](CoreSearchGetSearchAreasList200ResponseAreasInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreSearchGetSearchAreasList200Response

`func NewCoreSearchGetSearchAreasList200Response(areas []CoreSearchGetSearchAreasList200ResponseAreasInner, ) *CoreSearchGetSearchAreasList200Response`

NewCoreSearchGetSearchAreasList200Response instantiates a new CoreSearchGetSearchAreasList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreSearchGetSearchAreasList200ResponseWithDefaults

`func NewCoreSearchGetSearchAreasList200ResponseWithDefaults() *CoreSearchGetSearchAreasList200Response`

NewCoreSearchGetSearchAreasList200ResponseWithDefaults instantiates a new CoreSearchGetSearchAreasList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAreas

`func (o *CoreSearchGetSearchAreasList200Response) GetAreas() []CoreSearchGetSearchAreasList200ResponseAreasInner`

GetAreas returns the Areas field if non-nil, zero value otherwise.

### GetAreasOk

`func (o *CoreSearchGetSearchAreasList200Response) GetAreasOk() (*[]CoreSearchGetSearchAreasList200ResponseAreasInner, bool)`

GetAreasOk returns a tuple with the Areas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreas

`func (o *CoreSearchGetSearchAreasList200Response) SetAreas(v []CoreSearchGetSearchAreasList200ResponseAreasInner)`

SetAreas sets Areas field to given value.


### GetWarnings

`func (o *CoreSearchGetSearchAreasList200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreSearchGetSearchAreasList200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreSearchGetSearchAreasList200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreSearchGetSearchAreasList200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


