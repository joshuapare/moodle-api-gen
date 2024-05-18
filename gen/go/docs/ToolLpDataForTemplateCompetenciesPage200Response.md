# ToolLpDataForTemplateCompetenciesPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanagecompetencyframeworks** | **bool** | User can manage competency frameworks | 
**Canmanagetemplatecompetencies** | **bool** | User can manage learning plan templates | [default to null]
**Competencies** | [**[]ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner**](ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner.md) |  | 
**Manageurl** | **string** | Url to the manage competencies page. | 
**Pagecontextid** | **int32** | Context ID | 
**Pluginbaseurl** | **string** | Base URL of the plugin. | [default to "null"]
**Statistics** | [**ToolLpDataForTemplateCompetenciesPage200ResponseStatistics**](ToolLpDataForTemplateCompetenciesPage200ResponseStatistics.md) |  | 
**Template** | [**CoreCompetencyCreateTemplate200Response**](CoreCompetencyCreateTemplate200Response.md) |  | 

## Methods

### NewToolLpDataForTemplateCompetenciesPage200Response

`func NewToolLpDataForTemplateCompetenciesPage200Response(canmanagecompetencyframeworks bool, canmanagetemplatecompetencies bool, competencies []ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner, manageurl string, pagecontextid int32, pluginbaseurl string, statistics ToolLpDataForTemplateCompetenciesPage200ResponseStatistics, template CoreCompetencyCreateTemplate200Response, ) *ToolLpDataForTemplateCompetenciesPage200Response`

NewToolLpDataForTemplateCompetenciesPage200Response instantiates a new ToolLpDataForTemplateCompetenciesPage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForTemplateCompetenciesPage200ResponseWithDefaults

`func NewToolLpDataForTemplateCompetenciesPage200ResponseWithDefaults() *ToolLpDataForTemplateCompetenciesPage200Response`

NewToolLpDataForTemplateCompetenciesPage200ResponseWithDefaults instantiates a new ToolLpDataForTemplateCompetenciesPage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanagecompetencyframeworks

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetCanmanagecompetencyframeworks() bool`

GetCanmanagecompetencyframeworks returns the Canmanagecompetencyframeworks field if non-nil, zero value otherwise.

### GetCanmanagecompetencyframeworksOk

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetCanmanagecompetencyframeworksOk() (*bool, bool)`

GetCanmanagecompetencyframeworksOk returns a tuple with the Canmanagecompetencyframeworks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanagecompetencyframeworks

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) SetCanmanagecompetencyframeworks(v bool)`

SetCanmanagecompetencyframeworks sets Canmanagecompetencyframeworks field to given value.


### GetCanmanagetemplatecompetencies

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetCanmanagetemplatecompetencies() bool`

GetCanmanagetemplatecompetencies returns the Canmanagetemplatecompetencies field if non-nil, zero value otherwise.

### GetCanmanagetemplatecompetenciesOk

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetCanmanagetemplatecompetenciesOk() (*bool, bool)`

GetCanmanagetemplatecompetenciesOk returns a tuple with the Canmanagetemplatecompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanagetemplatecompetencies

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) SetCanmanagetemplatecompetencies(v bool)`

SetCanmanagetemplatecompetencies sets Canmanagetemplatecompetencies field to given value.


### GetCompetencies

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetCompetencies() []ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner`

GetCompetencies returns the Competencies field if non-nil, zero value otherwise.

### GetCompetenciesOk

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetCompetenciesOk() (*[]ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner, bool)`

GetCompetenciesOk returns a tuple with the Competencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencies

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) SetCompetencies(v []ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner)`

SetCompetencies sets Competencies field to given value.


### GetManageurl

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetManageurl() string`

GetManageurl returns the Manageurl field if non-nil, zero value otherwise.

### GetManageurlOk

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetManageurlOk() (*string, bool)`

GetManageurlOk returns a tuple with the Manageurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManageurl

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) SetManageurl(v string)`

SetManageurl sets Manageurl field to given value.


### GetPagecontextid

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetPagecontextid() int32`

GetPagecontextid returns the Pagecontextid field if non-nil, zero value otherwise.

### GetPagecontextidOk

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetPagecontextidOk() (*int32, bool)`

GetPagecontextidOk returns a tuple with the Pagecontextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagecontextid

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) SetPagecontextid(v int32)`

SetPagecontextid sets Pagecontextid field to given value.


### GetPluginbaseurl

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetPluginbaseurl() string`

GetPluginbaseurl returns the Pluginbaseurl field if non-nil, zero value otherwise.

### GetPluginbaseurlOk

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetPluginbaseurlOk() (*string, bool)`

GetPluginbaseurlOk returns a tuple with the Pluginbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPluginbaseurl

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) SetPluginbaseurl(v string)`

SetPluginbaseurl sets Pluginbaseurl field to given value.


### GetStatistics

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetStatistics() ToolLpDataForTemplateCompetenciesPage200ResponseStatistics`

GetStatistics returns the Statistics field if non-nil, zero value otherwise.

### GetStatisticsOk

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetStatisticsOk() (*ToolLpDataForTemplateCompetenciesPage200ResponseStatistics, bool)`

GetStatisticsOk returns a tuple with the Statistics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatistics

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) SetStatistics(v ToolLpDataForTemplateCompetenciesPage200ResponseStatistics)`

SetStatistics sets Statistics field to given value.


### GetTemplate

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetTemplate() CoreCompetencyCreateTemplate200Response`

GetTemplate returns the Template field if non-nil, zero value otherwise.

### GetTemplateOk

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) GetTemplateOk() (*CoreCompetencyCreateTemplate200Response, bool)`

GetTemplateOk returns a tuple with the Template field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplate

`func (o *ToolLpDataForTemplateCompetenciesPage200Response) SetTemplate(v CoreCompetencyCreateTemplate200Response)`

SetTemplate sets Template field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


