# ModLabelGetLabelsByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | [**[]ModLabelGetLabelsByCourses200ResponseLabelsInner**](ModLabelGetLabelsByCourses200ResponseLabelsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLabelGetLabelsByCourses200Response

`func NewModLabelGetLabelsByCourses200Response(labels []ModLabelGetLabelsByCourses200ResponseLabelsInner, ) *ModLabelGetLabelsByCourses200Response`

NewModLabelGetLabelsByCourses200Response instantiates a new ModLabelGetLabelsByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLabelGetLabelsByCourses200ResponseWithDefaults

`func NewModLabelGetLabelsByCourses200ResponseWithDefaults() *ModLabelGetLabelsByCourses200Response`

NewModLabelGetLabelsByCourses200ResponseWithDefaults instantiates a new ModLabelGetLabelsByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLabels

`func (o *ModLabelGetLabelsByCourses200Response) GetLabels() []ModLabelGetLabelsByCourses200ResponseLabelsInner`

GetLabels returns the Labels field if non-nil, zero value otherwise.

### GetLabelsOk

`func (o *ModLabelGetLabelsByCourses200Response) GetLabelsOk() (*[]ModLabelGetLabelsByCourses200ResponseLabelsInner, bool)`

GetLabelsOk returns a tuple with the Labels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabels

`func (o *ModLabelGetLabelsByCourses200Response) SetLabels(v []ModLabelGetLabelsByCourses200ResponseLabelsInner)`

SetLabels sets Labels field to given value.


### GetWarnings

`func (o *ModLabelGetLabelsByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLabelGetLabelsByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLabelGetLabelsByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLabelGetLabelsByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


