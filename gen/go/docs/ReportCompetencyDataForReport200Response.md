# ReportCompetencyDataForReport200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Course** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.md) |  | 
**Courseid** | **int32** | Course id | 
**Pushratingstouserplans** | **bool** | True if rating is push to user plans | [default to null]
**User** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | 
**Usercompetencies** | [**[]ReportCompetencyDataForReport200ResponseUsercompetenciesInner**](ReportCompetencyDataForReport200ResponseUsercompetenciesInner.md) |  | 

## Methods

### NewReportCompetencyDataForReport200Response

`func NewReportCompetencyDataForReport200Response(course CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse, courseid int32, pushratingstouserplans bool, user CoreCompetencyGradeCompetency200ResponseActionuser, usercompetencies []ReportCompetencyDataForReport200ResponseUsercompetenciesInner, ) *ReportCompetencyDataForReport200Response`

NewReportCompetencyDataForReport200Response instantiates a new ReportCompetencyDataForReport200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportCompetencyDataForReport200ResponseWithDefaults

`func NewReportCompetencyDataForReport200ResponseWithDefaults() *ReportCompetencyDataForReport200Response`

NewReportCompetencyDataForReport200ResponseWithDefaults instantiates a new ReportCompetencyDataForReport200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourse

`func (o *ReportCompetencyDataForReport200Response) GetCourse() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ReportCompetencyDataForReport200Response) GetCourseOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ReportCompetencyDataForReport200Response) SetCourse(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse)`

SetCourse sets Course field to given value.


### GetCourseid

`func (o *ReportCompetencyDataForReport200Response) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ReportCompetencyDataForReport200Response) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ReportCompetencyDataForReport200Response) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetPushratingstouserplans

`func (o *ReportCompetencyDataForReport200Response) GetPushratingstouserplans() bool`

GetPushratingstouserplans returns the Pushratingstouserplans field if non-nil, zero value otherwise.

### GetPushratingstouserplansOk

`func (o *ReportCompetencyDataForReport200Response) GetPushratingstouserplansOk() (*bool, bool)`

GetPushratingstouserplansOk returns a tuple with the Pushratingstouserplans field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPushratingstouserplans

`func (o *ReportCompetencyDataForReport200Response) SetPushratingstouserplans(v bool)`

SetPushratingstouserplans sets Pushratingstouserplans field to given value.


### GetUser

`func (o *ReportCompetencyDataForReport200Response) GetUser() CoreCompetencyGradeCompetency200ResponseActionuser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ReportCompetencyDataForReport200Response) GetUserOk() (*CoreCompetencyGradeCompetency200ResponseActionuser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ReportCompetencyDataForReport200Response) SetUser(v CoreCompetencyGradeCompetency200ResponseActionuser)`

SetUser sets User field to given value.


### GetUsercompetencies

`func (o *ReportCompetencyDataForReport200Response) GetUsercompetencies() []ReportCompetencyDataForReport200ResponseUsercompetenciesInner`

GetUsercompetencies returns the Usercompetencies field if non-nil, zero value otherwise.

### GetUsercompetenciesOk

`func (o *ReportCompetencyDataForReport200Response) GetUsercompetenciesOk() (*[]ReportCompetencyDataForReport200ResponseUsercompetenciesInner, bool)`

GetUsercompetenciesOk returns a tuple with the Usercompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercompetencies

`func (o *ReportCompetencyDataForReport200Response) SetUsercompetencies(v []ReportCompetencyDataForReport200ResponseUsercompetenciesInner)`

SetUsercompetencies sets Usercompetencies field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


