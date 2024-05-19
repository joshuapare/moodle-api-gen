# GradereportOverviewGetCourseGrades200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Grades** | [**[]GradereportOverviewGetCourseGrades200ResponseGradesInner**](GradereportOverviewGetCourseGrades200ResponseGradesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewGradereportOverviewGetCourseGrades200Response

`func NewGradereportOverviewGetCourseGrades200Response(grades []GradereportOverviewGetCourseGrades200ResponseGradesInner, ) *GradereportOverviewGetCourseGrades200Response`

NewGradereportOverviewGetCourseGrades200Response instantiates a new GradereportOverviewGetCourseGrades200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradereportOverviewGetCourseGrades200ResponseWithDefaults

`func NewGradereportOverviewGetCourseGrades200ResponseWithDefaults() *GradereportOverviewGetCourseGrades200Response`

NewGradereportOverviewGetCourseGrades200ResponseWithDefaults instantiates a new GradereportOverviewGetCourseGrades200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGrades

`func (o *GradereportOverviewGetCourseGrades200Response) GetGrades() []GradereportOverviewGetCourseGrades200ResponseGradesInner`

GetGrades returns the Grades field if non-nil, zero value otherwise.

### GetGradesOk

`func (o *GradereportOverviewGetCourseGrades200Response) GetGradesOk() (*[]GradereportOverviewGetCourseGrades200ResponseGradesInner, bool)`

GetGradesOk returns a tuple with the Grades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrades

`func (o *GradereportOverviewGetCourseGrades200Response) SetGrades(v []GradereportOverviewGetCourseGrades200ResponseGradesInner)`

SetGrades sets Grades field to given value.


### GetWarnings

`func (o *GradereportOverviewGetCourseGrades200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *GradereportOverviewGetCourseGrades200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *GradereportOverviewGetCourseGrades200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *GradereportOverviewGetCourseGrades200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


