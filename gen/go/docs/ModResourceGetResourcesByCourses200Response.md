# ModResourceGetResourcesByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Resources** | [**[]ModResourceGetResourcesByCourses200ResponseResourcesInner**](ModResourceGetResourcesByCourses200ResponseResourcesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModResourceGetResourcesByCourses200Response

`func NewModResourceGetResourcesByCourses200Response(resources []ModResourceGetResourcesByCourses200ResponseResourcesInner, ) *ModResourceGetResourcesByCourses200Response`

NewModResourceGetResourcesByCourses200Response instantiates a new ModResourceGetResourcesByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModResourceGetResourcesByCourses200ResponseWithDefaults

`func NewModResourceGetResourcesByCourses200ResponseWithDefaults() *ModResourceGetResourcesByCourses200Response`

NewModResourceGetResourcesByCourses200ResponseWithDefaults instantiates a new ModResourceGetResourcesByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResources

`func (o *ModResourceGetResourcesByCourses200Response) GetResources() []ModResourceGetResourcesByCourses200ResponseResourcesInner`

GetResources returns the Resources field if non-nil, zero value otherwise.

### GetResourcesOk

`func (o *ModResourceGetResourcesByCourses200Response) GetResourcesOk() (*[]ModResourceGetResourcesByCourses200ResponseResourcesInner, bool)`

GetResourcesOk returns a tuple with the Resources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResources

`func (o *ModResourceGetResourcesByCourses200Response) SetResources(v []ModResourceGetResourcesByCourses200ResponseResourcesInner)`

SetResources sets Resources field to given value.


### GetWarnings

`func (o *ModResourceGetResourcesByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModResourceGetResourcesByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModResourceGetResourcesByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModResourceGetResourcesByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


