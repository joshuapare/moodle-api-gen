# GradereportOverviewGetCourseGradesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Userid** | Pointer to **int32** | Get grades for this user (optional, default current) | [optional] [default to 0]

## Methods

### NewGradereportOverviewGetCourseGradesRequest

`func NewGradereportOverviewGetCourseGradesRequest() *GradereportOverviewGetCourseGradesRequest`

NewGradereportOverviewGetCourseGradesRequest instantiates a new GradereportOverviewGetCourseGradesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradereportOverviewGetCourseGradesRequestWithDefaults

`func NewGradereportOverviewGetCourseGradesRequestWithDefaults() *GradereportOverviewGetCourseGradesRequest`

NewGradereportOverviewGetCourseGradesRequestWithDefaults instantiates a new GradereportOverviewGetCourseGradesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserid

`func (o *GradereportOverviewGetCourseGradesRequest) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *GradereportOverviewGetCourseGradesRequest) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *GradereportOverviewGetCourseGradesRequest) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *GradereportOverviewGetCourseGradesRequest) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


