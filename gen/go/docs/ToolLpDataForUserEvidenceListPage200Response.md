# ToolLpDataForUserEvidenceListPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanage** | **bool** | Can the current user manage the user&#39;s evidence | [default to null]
**Evidence** | [**[]ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner**](ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner.md) |  | 
**Navigation** | **[]map[string]interface{}** |  | 
**Pluginbaseurl** | **string** | Url to the tool_lp plugin folder on this Moodle site | 
**Userid** | **int32** | The user ID | 

## Methods

### NewToolLpDataForUserEvidenceListPage200Response

`func NewToolLpDataForUserEvidenceListPage200Response(canmanage bool, evidence []ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner, navigation []map[string]interface{}, pluginbaseurl string, userid int32, ) *ToolLpDataForUserEvidenceListPage200Response`

NewToolLpDataForUserEvidenceListPage200Response instantiates a new ToolLpDataForUserEvidenceListPage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForUserEvidenceListPage200ResponseWithDefaults

`func NewToolLpDataForUserEvidenceListPage200ResponseWithDefaults() *ToolLpDataForUserEvidenceListPage200Response`

NewToolLpDataForUserEvidenceListPage200ResponseWithDefaults instantiates a new ToolLpDataForUserEvidenceListPage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanage

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *ToolLpDataForUserEvidenceListPage200Response) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetEvidence

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetEvidence() []ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner`

GetEvidence returns the Evidence field if non-nil, zero value otherwise.

### GetEvidenceOk

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetEvidenceOk() (*[]ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner, bool)`

GetEvidenceOk returns a tuple with the Evidence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvidence

`func (o *ToolLpDataForUserEvidenceListPage200Response) SetEvidence(v []ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner)`

SetEvidence sets Evidence field to given value.


### GetNavigation

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetNavigation() []map[string]interface{}`

GetNavigation returns the Navigation field if non-nil, zero value otherwise.

### GetNavigationOk

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetNavigationOk() (*[]map[string]interface{}, bool)`

GetNavigationOk returns a tuple with the Navigation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNavigation

`func (o *ToolLpDataForUserEvidenceListPage200Response) SetNavigation(v []map[string]interface{})`

SetNavigation sets Navigation field to given value.


### GetPluginbaseurl

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetPluginbaseurl() string`

GetPluginbaseurl returns the Pluginbaseurl field if non-nil, zero value otherwise.

### GetPluginbaseurlOk

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetPluginbaseurlOk() (*string, bool)`

GetPluginbaseurlOk returns a tuple with the Pluginbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPluginbaseurl

`func (o *ToolLpDataForUserEvidenceListPage200Response) SetPluginbaseurl(v string)`

SetPluginbaseurl sets Pluginbaseurl field to given value.


### GetUserid

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ToolLpDataForUserEvidenceListPage200Response) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ToolLpDataForUserEvidenceListPage200Response) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


