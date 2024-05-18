# ToolLpDataForCompetenciesManagePage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanage** | **bool** | True if this user has permission to manage competency frameworks | [default to null]
**Framework** | [**CoreCompetencyDuplicateCompetencyFramework200Response**](CoreCompetencyDuplicateCompetencyFramework200Response.md) |  | 
**Pagecontextid** | **int32** | Context id for the framework | [default to null]
**Pluginbaseurl** | **string** | Plugin base url | [default to "null"]
**Rulesmodules** | **string** | JSON encoded data for rules | [default to "null"]
**Search** | **string** | Current search string | [default to "null"]

## Methods

### NewToolLpDataForCompetenciesManagePage200Response

`func NewToolLpDataForCompetenciesManagePage200Response(canmanage bool, framework CoreCompetencyDuplicateCompetencyFramework200Response, pagecontextid int32, pluginbaseurl string, rulesmodules string, search string, ) *ToolLpDataForCompetenciesManagePage200Response`

NewToolLpDataForCompetenciesManagePage200Response instantiates a new ToolLpDataForCompetenciesManagePage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForCompetenciesManagePage200ResponseWithDefaults

`func NewToolLpDataForCompetenciesManagePage200ResponseWithDefaults() *ToolLpDataForCompetenciesManagePage200Response`

NewToolLpDataForCompetenciesManagePage200ResponseWithDefaults instantiates a new ToolLpDataForCompetenciesManagePage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanage

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *ToolLpDataForCompetenciesManagePage200Response) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetFramework

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetFramework() CoreCompetencyDuplicateCompetencyFramework200Response`

GetFramework returns the Framework field if non-nil, zero value otherwise.

### GetFrameworkOk

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetFrameworkOk() (*CoreCompetencyDuplicateCompetencyFramework200Response, bool)`

GetFrameworkOk returns a tuple with the Framework field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFramework

`func (o *ToolLpDataForCompetenciesManagePage200Response) SetFramework(v CoreCompetencyDuplicateCompetencyFramework200Response)`

SetFramework sets Framework field to given value.


### GetPagecontextid

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetPagecontextid() int32`

GetPagecontextid returns the Pagecontextid field if non-nil, zero value otherwise.

### GetPagecontextidOk

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetPagecontextidOk() (*int32, bool)`

GetPagecontextidOk returns a tuple with the Pagecontextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagecontextid

`func (o *ToolLpDataForCompetenciesManagePage200Response) SetPagecontextid(v int32)`

SetPagecontextid sets Pagecontextid field to given value.


### GetPluginbaseurl

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetPluginbaseurl() string`

GetPluginbaseurl returns the Pluginbaseurl field if non-nil, zero value otherwise.

### GetPluginbaseurlOk

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetPluginbaseurlOk() (*string, bool)`

GetPluginbaseurlOk returns a tuple with the Pluginbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPluginbaseurl

`func (o *ToolLpDataForCompetenciesManagePage200Response) SetPluginbaseurl(v string)`

SetPluginbaseurl sets Pluginbaseurl field to given value.


### GetRulesmodules

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetRulesmodules() string`

GetRulesmodules returns the Rulesmodules field if non-nil, zero value otherwise.

### GetRulesmodulesOk

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetRulesmodulesOk() (*string, bool)`

GetRulesmodulesOk returns a tuple with the Rulesmodules field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRulesmodules

`func (o *ToolLpDataForCompetenciesManagePage200Response) SetRulesmodules(v string)`

SetRulesmodules sets Rulesmodules field to given value.


### GetSearch

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetSearch() string`

GetSearch returns the Search field if non-nil, zero value otherwise.

### GetSearchOk

`func (o *ToolLpDataForCompetenciesManagePage200Response) GetSearchOk() (*string, bool)`

GetSearchOk returns a tuple with the Search field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearch

`func (o *ToolLpDataForCompetenciesManagePage200Response) SetSearch(v string)`

SetSearch sets Search field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


