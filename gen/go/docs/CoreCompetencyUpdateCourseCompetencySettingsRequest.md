# CoreCompetencyUpdateCourseCompetencySettingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Course id for the course to update | [default to null]
**Settings** | [**CoreCompetencyUpdateCourseCompetencySettingsRequestSettings**](CoreCompetencyUpdateCourseCompetencySettingsRequestSettings.md) |  | 

## Methods

### NewCoreCompetencyUpdateCourseCompetencySettingsRequest

`func NewCoreCompetencyUpdateCourseCompetencySettingsRequest(courseid int32, settings CoreCompetencyUpdateCourseCompetencySettingsRequestSettings, ) *CoreCompetencyUpdateCourseCompetencySettingsRequest`

NewCoreCompetencyUpdateCourseCompetencySettingsRequest instantiates a new CoreCompetencyUpdateCourseCompetencySettingsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyUpdateCourseCompetencySettingsRequestWithDefaults

`func NewCoreCompetencyUpdateCourseCompetencySettingsRequestWithDefaults() *CoreCompetencyUpdateCourseCompetencySettingsRequest`

NewCoreCompetencyUpdateCourseCompetencySettingsRequestWithDefaults instantiates a new CoreCompetencyUpdateCourseCompetencySettingsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreCompetencyUpdateCourseCompetencySettingsRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCompetencyUpdateCourseCompetencySettingsRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCompetencyUpdateCourseCompetencySettingsRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetSettings

`func (o *CoreCompetencyUpdateCourseCompetencySettingsRequest) GetSettings() CoreCompetencyUpdateCourseCompetencySettingsRequestSettings`

GetSettings returns the Settings field if non-nil, zero value otherwise.

### GetSettingsOk

`func (o *CoreCompetencyUpdateCourseCompetencySettingsRequest) GetSettingsOk() (*CoreCompetencyUpdateCourseCompetencySettingsRequestSettings, bool)`

GetSettingsOk returns a tuple with the Settings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettings

`func (o *CoreCompetencyUpdateCourseCompetencySettingsRequest) SetSettings(v CoreCompetencyUpdateCourseCompetencySettingsRequestSettings)`

SetSettings sets Settings field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


