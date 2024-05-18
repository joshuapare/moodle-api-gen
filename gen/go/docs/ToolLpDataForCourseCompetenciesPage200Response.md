# ToolLpDataForCourseCompetenciesPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canconfigurecoursecompetencies** | **bool** | User can configure course competency settings | [default to null]
**Cangradecompetencies** | **bool** | User can grade competencies. | [default to null]
**Canmanagecompetencyframeworks** | **bool** | User can manage competency frameworks | [default to null]
**Canmanagecoursecompetencies** | **bool** | User can manage linked course competencies | [default to null]
**Competencies** | [**[]ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner.md) |  | 
**Courseid** | **int32** | The current course id | [default to null]
**Gradableuserid** | Pointer to **int32** | Current user id, if the user is a gradable user. | [optional] [default to null]
**Manageurl** | **string** | Url to the manage competencies page. | [default to "null"]
**Pagecontextid** | **int32** | The current page context ID. | [default to null]
**Pluginbaseurl** | **string** | Url to the course competencies page. | [default to "null"]
**Settings** | [**ToolLpDataForCourseCompetenciesPage200ResponseSettings**](ToolLpDataForCourseCompetenciesPage200ResponseSettings.md) |  | 
**Statistics** | [**ToolLpDataForCourseCompetenciesPage200ResponseStatistics**](ToolLpDataForCourseCompetenciesPage200ResponseStatistics.md) |  | 

## Methods

### NewToolLpDataForCourseCompetenciesPage200Response

`func NewToolLpDataForCourseCompetenciesPage200Response(canconfigurecoursecompetencies bool, cangradecompetencies bool, canmanagecompetencyframeworks bool, canmanagecoursecompetencies bool, competencies []ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner, courseid int32, manageurl string, pagecontextid int32, pluginbaseurl string, settings ToolLpDataForCourseCompetenciesPage200ResponseSettings, statistics ToolLpDataForCourseCompetenciesPage200ResponseStatistics, ) *ToolLpDataForCourseCompetenciesPage200Response`

NewToolLpDataForCourseCompetenciesPage200Response instantiates a new ToolLpDataForCourseCompetenciesPage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForCourseCompetenciesPage200ResponseWithDefaults

`func NewToolLpDataForCourseCompetenciesPage200ResponseWithDefaults() *ToolLpDataForCourseCompetenciesPage200Response`

NewToolLpDataForCourseCompetenciesPage200ResponseWithDefaults instantiates a new ToolLpDataForCourseCompetenciesPage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanconfigurecoursecompetencies

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCanconfigurecoursecompetencies() bool`

GetCanconfigurecoursecompetencies returns the Canconfigurecoursecompetencies field if non-nil, zero value otherwise.

### GetCanconfigurecoursecompetenciesOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCanconfigurecoursecompetenciesOk() (*bool, bool)`

GetCanconfigurecoursecompetenciesOk returns a tuple with the Canconfigurecoursecompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanconfigurecoursecompetencies

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetCanconfigurecoursecompetencies(v bool)`

SetCanconfigurecoursecompetencies sets Canconfigurecoursecompetencies field to given value.


### GetCangradecompetencies

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCangradecompetencies() bool`

GetCangradecompetencies returns the Cangradecompetencies field if non-nil, zero value otherwise.

### GetCangradecompetenciesOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCangradecompetenciesOk() (*bool, bool)`

GetCangradecompetenciesOk returns a tuple with the Cangradecompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCangradecompetencies

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetCangradecompetencies(v bool)`

SetCangradecompetencies sets Cangradecompetencies field to given value.


### GetCanmanagecompetencyframeworks

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCanmanagecompetencyframeworks() bool`

GetCanmanagecompetencyframeworks returns the Canmanagecompetencyframeworks field if non-nil, zero value otherwise.

### GetCanmanagecompetencyframeworksOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCanmanagecompetencyframeworksOk() (*bool, bool)`

GetCanmanagecompetencyframeworksOk returns a tuple with the Canmanagecompetencyframeworks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanagecompetencyframeworks

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetCanmanagecompetencyframeworks(v bool)`

SetCanmanagecompetencyframeworks sets Canmanagecompetencyframeworks field to given value.


### GetCanmanagecoursecompetencies

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCanmanagecoursecompetencies() bool`

GetCanmanagecoursecompetencies returns the Canmanagecoursecompetencies field if non-nil, zero value otherwise.

### GetCanmanagecoursecompetenciesOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCanmanagecoursecompetenciesOk() (*bool, bool)`

GetCanmanagecoursecompetenciesOk returns a tuple with the Canmanagecoursecompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanagecoursecompetencies

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetCanmanagecoursecompetencies(v bool)`

SetCanmanagecoursecompetencies sets Canmanagecoursecompetencies field to given value.


### GetCompetencies

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCompetencies() []ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner`

GetCompetencies returns the Competencies field if non-nil, zero value otherwise.

### GetCompetenciesOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCompetenciesOk() (*[]ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner, bool)`

GetCompetenciesOk returns a tuple with the Competencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencies

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetCompetencies(v []ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner)`

SetCompetencies sets Competencies field to given value.


### GetCourseid

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetGradableuserid

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetGradableuserid() int32`

GetGradableuserid returns the Gradableuserid field if non-nil, zero value otherwise.

### GetGradableuseridOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetGradableuseridOk() (*int32, bool)`

GetGradableuseridOk returns a tuple with the Gradableuserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradableuserid

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetGradableuserid(v int32)`

SetGradableuserid sets Gradableuserid field to given value.

### HasGradableuserid

`func (o *ToolLpDataForCourseCompetenciesPage200Response) HasGradableuserid() bool`

HasGradableuserid returns a boolean if a field has been set.

### GetManageurl

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetManageurl() string`

GetManageurl returns the Manageurl field if non-nil, zero value otherwise.

### GetManageurlOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetManageurlOk() (*string, bool)`

GetManageurlOk returns a tuple with the Manageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManageurl

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetManageurl(v string)`

SetManageurl sets Manageurl field to given value.


### GetPagecontextid

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetPagecontextid() int32`

GetPagecontextid returns the Pagecontextid field if non-nil, zero value otherwise.

### GetPagecontextidOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetPagecontextidOk() (*int32, bool)`

GetPagecontextidOk returns a tuple with the Pagecontextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagecontextid

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetPagecontextid(v int32)`

SetPagecontextid sets Pagecontextid field to given value.


### GetPluginbaseurl

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetPluginbaseurl() string`

GetPluginbaseurl returns the Pluginbaseurl field if non-nil, zero value otherwise.

### GetPluginbaseurlOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetPluginbaseurlOk() (*string, bool)`

GetPluginbaseurlOk returns a tuple with the Pluginbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPluginbaseurl

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetPluginbaseurl(v string)`

SetPluginbaseurl sets Pluginbaseurl field to given value.


### GetSettings

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetSettings() ToolLpDataForCourseCompetenciesPage200ResponseSettings`

GetSettings returns the Settings field if non-nil, zero value otherwise.

### GetSettingsOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetSettingsOk() (*ToolLpDataForCourseCompetenciesPage200ResponseSettings, bool)`

GetSettingsOk returns a tuple with the Settings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettings

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetSettings(v ToolLpDataForCourseCompetenciesPage200ResponseSettings)`

SetSettings sets Settings field to given value.


### GetStatistics

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetStatistics() ToolLpDataForCourseCompetenciesPage200ResponseStatistics`

GetStatistics returns the Statistics field if non-nil, zero value otherwise.

### GetStatisticsOk

`func (o *ToolLpDataForCourseCompetenciesPage200Response) GetStatisticsOk() (*ToolLpDataForCourseCompetenciesPage200ResponseStatistics, bool)`

GetStatisticsOk returns a tuple with the Statistics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatistics

`func (o *ToolLpDataForCourseCompetenciesPage200Response) SetStatistics(v ToolLpDataForCourseCompetenciesPage200ResponseStatistics)`

SetStatistics sets Statistics field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


