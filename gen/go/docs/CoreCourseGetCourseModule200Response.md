# CoreCourseGetCourseModule200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cm** | [**CoreCourseGetCourseModule200ResponseCm**](CoreCourseGetCourseModule200ResponseCm.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCourseGetCourseModule200Response

`func NewCoreCourseGetCourseModule200Response(cm CoreCourseGetCourseModule200ResponseCm, ) *CoreCourseGetCourseModule200Response`

NewCoreCourseGetCourseModule200Response instantiates a new CoreCourseGetCourseModule200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetCourseModule200ResponseWithDefaults

`func NewCoreCourseGetCourseModule200ResponseWithDefaults() *CoreCourseGetCourseModule200Response`

NewCoreCourseGetCourseModule200ResponseWithDefaults instantiates a new CoreCourseGetCourseModule200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCm

`func (o *CoreCourseGetCourseModule200Response) GetCm() CoreCourseGetCourseModule200ResponseCm`

GetCm returns the Cm field if non-nil, zero value otherwise.

### GetCmOk

`func (o *CoreCourseGetCourseModule200Response) GetCmOk() (*CoreCourseGetCourseModule200ResponseCm, bool)`

GetCmOk returns a tuple with the Cm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCm

`func (o *CoreCourseGetCourseModule200Response) SetCm(v CoreCourseGetCourseModule200ResponseCm)`

SetCm sets Cm field to given value.


### GetWarnings

`func (o *CoreCourseGetCourseModule200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCourseGetCourseModule200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCourseGetCourseModule200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCourseGetCourseModule200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


