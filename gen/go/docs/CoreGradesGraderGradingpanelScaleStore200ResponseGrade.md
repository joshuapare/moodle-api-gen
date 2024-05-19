# CoreGradesGraderGradingpanelScaleStore200ResponseGrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Gradedby** | **string** | The assumed grader of this grading instance | 
**Maxgrade** | **string** | Max possible grade | 
**Options** | [**[]CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner**](CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner.md) |  | 
**Timecreated** | **int32** | The time that the grade was created | 
**Timemodified** | **int32** | The time that the grade was last updated | 
**Usergrade** | **string** | Current user grade | 

## Methods

### NewCoreGradesGraderGradingpanelScaleStore200ResponseGrade

`func NewCoreGradesGraderGradingpanelScaleStore200ResponseGrade(gradedby string, maxgrade string, options []CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner, timecreated int32, timemodified int32, usergrade string, ) *CoreGradesGraderGradingpanelScaleStore200ResponseGrade`

NewCoreGradesGraderGradingpanelScaleStore200ResponseGrade instantiates a new CoreGradesGraderGradingpanelScaleStore200ResponseGrade object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGraderGradingpanelScaleStore200ResponseGradeWithDefaults

`func NewCoreGradesGraderGradingpanelScaleStore200ResponseGradeWithDefaults() *CoreGradesGraderGradingpanelScaleStore200ResponseGrade`

NewCoreGradesGraderGradingpanelScaleStore200ResponseGradeWithDefaults instantiates a new CoreGradesGraderGradingpanelScaleStore200ResponseGrade object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGradedby

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetGradedby() string`

GetGradedby returns the Gradedby field if non-nil, zero value otherwise.

### GetGradedbyOk

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetGradedbyOk() (*string, bool)`

GetGradedbyOk returns a tuple with the Gradedby field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradedby

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) SetGradedby(v string)`

SetGradedby sets Gradedby field to given value.


### GetMaxgrade

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetMaxgrade() string`

GetMaxgrade returns the Maxgrade field if non-nil, zero value otherwise.

### GetMaxgradeOk

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetMaxgradeOk() (*string, bool)`

GetMaxgradeOk returns a tuple with the Maxgrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxgrade

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) SetMaxgrade(v string)`

SetMaxgrade sets Maxgrade field to given value.


### GetOptions

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetOptions() []CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetOptionsOk() (*[]CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) SetOptions(v []CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner)`

SetOptions sets Options field to given value.


### GetTimecreated

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUsergrade

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetUsergrade() string`

GetUsergrade returns the Usergrade field if non-nil, zero value otherwise.

### GetUsergradeOk

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) GetUsergradeOk() (*string, bool)`

GetUsergradeOk returns a tuple with the Usergrade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsergrade

`func (o *CoreGradesGraderGradingpanelScaleStore200ResponseGrade) SetUsergrade(v string)`

SetUsergrade sets Usergrade field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


