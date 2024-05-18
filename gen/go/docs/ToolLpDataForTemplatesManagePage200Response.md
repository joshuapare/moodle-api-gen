# ToolLpDataForTemplatesManagePage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanage** | **bool** | Whether the user manage the templates | [default to null]
**Navigation** | **[]map[string]interface{}** |  | 
**Pagecontextid** | **int32** | The page context id | 
**Pluginbaseurl** | **string** | Url to the tool_lp plugin folder on this Moodle site | 
**Templates** | [**[]ToolLpDataForTemplatesManagePage200ResponseTemplatesInner**](ToolLpDataForTemplatesManagePage200ResponseTemplatesInner.md) |  | 

## Methods

### NewToolLpDataForTemplatesManagePage200Response

`func NewToolLpDataForTemplatesManagePage200Response(canmanage bool, navigation []map[string]interface{}, pagecontextid int32, pluginbaseurl string, templates []ToolLpDataForTemplatesManagePage200ResponseTemplatesInner, ) *ToolLpDataForTemplatesManagePage200Response`

NewToolLpDataForTemplatesManagePage200Response instantiates a new ToolLpDataForTemplatesManagePage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForTemplatesManagePage200ResponseWithDefaults

`func NewToolLpDataForTemplatesManagePage200ResponseWithDefaults() *ToolLpDataForTemplatesManagePage200Response`

NewToolLpDataForTemplatesManagePage200ResponseWithDefaults instantiates a new ToolLpDataForTemplatesManagePage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanage

`func (o *ToolLpDataForTemplatesManagePage200Response) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *ToolLpDataForTemplatesManagePage200Response) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *ToolLpDataForTemplatesManagePage200Response) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetNavigation

`func (o *ToolLpDataForTemplatesManagePage200Response) GetNavigation() []map[string]interface{}`

GetNavigation returns the Navigation field if non-nil, zero value otherwise.

### GetNavigationOk

`func (o *ToolLpDataForTemplatesManagePage200Response) GetNavigationOk() (*[]map[string]interface{}, bool)`

GetNavigationOk returns a tuple with the Navigation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNavigation

`func (o *ToolLpDataForTemplatesManagePage200Response) SetNavigation(v []map[string]interface{})`

SetNavigation sets Navigation field to given value.


### GetPagecontextid

`func (o *ToolLpDataForTemplatesManagePage200Response) GetPagecontextid() int32`

GetPagecontextid returns the Pagecontextid field if non-nil, zero value otherwise.

### GetPagecontextidOk

`func (o *ToolLpDataForTemplatesManagePage200Response) GetPagecontextidOk() (*int32, bool)`

GetPagecontextidOk returns a tuple with the Pagecontextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagecontextid

`func (o *ToolLpDataForTemplatesManagePage200Response) SetPagecontextid(v int32)`

SetPagecontextid sets Pagecontextid field to given value.


### GetPluginbaseurl

`func (o *ToolLpDataForTemplatesManagePage200Response) GetPluginbaseurl() string`

GetPluginbaseurl returns the Pluginbaseurl field if non-nil, zero value otherwise.

### GetPluginbaseurlOk

`func (o *ToolLpDataForTemplatesManagePage200Response) GetPluginbaseurlOk() (*string, bool)`

GetPluginbaseurlOk returns a tuple with the Pluginbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPluginbaseurl

`func (o *ToolLpDataForTemplatesManagePage200Response) SetPluginbaseurl(v string)`

SetPluginbaseurl sets Pluginbaseurl field to given value.


### GetTemplates

`func (o *ToolLpDataForTemplatesManagePage200Response) GetTemplates() []ToolLpDataForTemplatesManagePage200ResponseTemplatesInner`

GetTemplates returns the Templates field if non-nil, zero value otherwise.

### GetTemplatesOk

`func (o *ToolLpDataForTemplatesManagePage200Response) GetTemplatesOk() (*[]ToolLpDataForTemplatesManagePage200ResponseTemplatesInner, bool)`

GetTemplatesOk returns a tuple with the Templates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplates

`func (o *ToolLpDataForTemplatesManagePage200Response) SetTemplates(v []ToolLpDataForTemplatesManagePage200ResponseTemplatesInner)`

SetTemplates sets Templates field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


