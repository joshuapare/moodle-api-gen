# ToolLpDataForPlansPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanageuserplans** | **bool** | Can the current user manage the user&#39;s plans | [default to null]
**Canreaduserevidence** | **bool** | Can the current user view the user&#39;s evidence | [default to null]
**Navigation** | **[]map[string]interface{}** |  | 
**Plans** | [**[]ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner**](ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.md) |  | 
**Pluginbaseurl** | **string** | Url to the tool_lp plugin folder on this Moodle site | 
**Userid** | **int32** | The learning plan user id | [default to null]

## Methods

### NewToolLpDataForPlansPage200Response

`func NewToolLpDataForPlansPage200Response(canmanageuserplans bool, canreaduserevidence bool, navigation []map[string]interface{}, plans []ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner, pluginbaseurl string, userid int32, ) *ToolLpDataForPlansPage200Response`

NewToolLpDataForPlansPage200Response instantiates a new ToolLpDataForPlansPage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForPlansPage200ResponseWithDefaults

`func NewToolLpDataForPlansPage200ResponseWithDefaults() *ToolLpDataForPlansPage200Response`

NewToolLpDataForPlansPage200ResponseWithDefaults instantiates a new ToolLpDataForPlansPage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanageuserplans

`func (o *ToolLpDataForPlansPage200Response) GetCanmanageuserplans() bool`

GetCanmanageuserplans returns the Canmanageuserplans field if non-nil, zero value otherwise.

### GetCanmanageuserplansOk

`func (o *ToolLpDataForPlansPage200Response) GetCanmanageuserplansOk() (*bool, bool)`

GetCanmanageuserplansOk returns a tuple with the Canmanageuserplans field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanageuserplans

`func (o *ToolLpDataForPlansPage200Response) SetCanmanageuserplans(v bool)`

SetCanmanageuserplans sets Canmanageuserplans field to given value.


### GetCanreaduserevidence

`func (o *ToolLpDataForPlansPage200Response) GetCanreaduserevidence() bool`

GetCanreaduserevidence returns the Canreaduserevidence field if non-nil, zero value otherwise.

### GetCanreaduserevidenceOk

`func (o *ToolLpDataForPlansPage200Response) GetCanreaduserevidenceOk() (*bool, bool)`

GetCanreaduserevidenceOk returns a tuple with the Canreaduserevidence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanreaduserevidence

`func (o *ToolLpDataForPlansPage200Response) SetCanreaduserevidence(v bool)`

SetCanreaduserevidence sets Canreaduserevidence field to given value.


### GetNavigation

`func (o *ToolLpDataForPlansPage200Response) GetNavigation() []map[string]interface{}`

GetNavigation returns the Navigation field if non-nil, zero value otherwise.

### GetNavigationOk

`func (o *ToolLpDataForPlansPage200Response) GetNavigationOk() (*[]map[string]interface{}, bool)`

GetNavigationOk returns a tuple with the Navigation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNavigation

`func (o *ToolLpDataForPlansPage200Response) SetNavigation(v []map[string]interface{})`

SetNavigation sets Navigation field to given value.


### GetPlans

`func (o *ToolLpDataForPlansPage200Response) GetPlans() []ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner`

GetPlans returns the Plans field if non-nil, zero value otherwise.

### GetPlansOk

`func (o *ToolLpDataForPlansPage200Response) GetPlansOk() (*[]ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner, bool)`

GetPlansOk returns a tuple with the Plans field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlans

`func (o *ToolLpDataForPlansPage200Response) SetPlans(v []ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner)`

SetPlans sets Plans field to given value.


### GetPluginbaseurl

`func (o *ToolLpDataForPlansPage200Response) GetPluginbaseurl() string`

GetPluginbaseurl returns the Pluginbaseurl field if non-nil, zero value otherwise.

### GetPluginbaseurlOk

`func (o *ToolLpDataForPlansPage200Response) GetPluginbaseurlOk() (*string, bool)`

GetPluginbaseurlOk returns a tuple with the Pluginbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPluginbaseurl

`func (o *ToolLpDataForPlansPage200Response) SetPluginbaseurl(v string)`

SetPluginbaseurl sets Pluginbaseurl field to given value.


### GetUserid

`func (o *ToolLpDataForPlansPage200Response) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ToolLpDataForPlansPage200Response) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ToolLpDataForPlansPage200Response) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


