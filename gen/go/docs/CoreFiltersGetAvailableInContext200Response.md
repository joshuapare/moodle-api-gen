# CoreFiltersGetAvailableInContext200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Filters** | [**[]CoreFiltersGetAvailableInContext200ResponseFiltersInner**](CoreFiltersGetAvailableInContext200ResponseFiltersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreFiltersGetAvailableInContext200Response

`func NewCoreFiltersGetAvailableInContext200Response(filters []CoreFiltersGetAvailableInContext200ResponseFiltersInner, ) *CoreFiltersGetAvailableInContext200Response`

NewCoreFiltersGetAvailableInContext200Response instantiates a new CoreFiltersGetAvailableInContext200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFiltersGetAvailableInContext200ResponseWithDefaults

`func NewCoreFiltersGetAvailableInContext200ResponseWithDefaults() *CoreFiltersGetAvailableInContext200Response`

NewCoreFiltersGetAvailableInContext200ResponseWithDefaults instantiates a new CoreFiltersGetAvailableInContext200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilters

`func (o *CoreFiltersGetAvailableInContext200Response) GetFilters() []CoreFiltersGetAvailableInContext200ResponseFiltersInner`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CoreFiltersGetAvailableInContext200Response) GetFiltersOk() (*[]CoreFiltersGetAvailableInContext200ResponseFiltersInner, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CoreFiltersGetAvailableInContext200Response) SetFilters(v []CoreFiltersGetAvailableInContext200ResponseFiltersInner)`

SetFilters sets Filters field to given value.


### GetWarnings

`func (o *CoreFiltersGetAvailableInContext200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreFiltersGetAvailableInContext200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreFiltersGetAvailableInContext200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreFiltersGetAvailableInContext200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


