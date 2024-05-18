# ToolMobileGetContent200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Disabled** | Pointer to **bool** | Whether we consider this disabled or not. | [optional] [default to null]
**Files** | [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**Javascript** | **string** | JavaScript code. | [default to "null"]
**Otherdata** | [**[]ToolMobileGetContent200ResponseOtherdataInner**](ToolMobileGetContent200ResponseOtherdataInner.md) |  | 
**Restrict** | [**ToolMobileGetContent200ResponseRestrict**](ToolMobileGetContent200ResponseRestrict.md) |  | 
**Templates** | [**[]ToolMobileGetContent200ResponseTemplatesInner**](ToolMobileGetContent200ResponseTemplatesInner.md) |  | 

## Methods

### NewToolMobileGetContent200Response

`func NewToolMobileGetContent200Response(files []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, javascript string, otherdata []ToolMobileGetContent200ResponseOtherdataInner, restrict ToolMobileGetContent200ResponseRestrict, templates []ToolMobileGetContent200ResponseTemplatesInner, ) *ToolMobileGetContent200Response`

NewToolMobileGetContent200Response instantiates a new ToolMobileGetContent200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileGetContent200ResponseWithDefaults

`func NewToolMobileGetContent200ResponseWithDefaults() *ToolMobileGetContent200Response`

NewToolMobileGetContent200ResponseWithDefaults instantiates a new ToolMobileGetContent200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDisabled

`func (o *ToolMobileGetContent200Response) GetDisabled() bool`

GetDisabled returns the Disabled field if non-nil, zero value otherwise.

### GetDisabledOk

`func (o *ToolMobileGetContent200Response) GetDisabledOk() (*bool, bool)`

GetDisabledOk returns a tuple with the Disabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisabled

`func (o *ToolMobileGetContent200Response) SetDisabled(v bool)`

SetDisabled sets Disabled field to given value.

### HasDisabled

`func (o *ToolMobileGetContent200Response) HasDisabled() bool`

HasDisabled returns a boolean if a field has been set.

### GetFiles

`func (o *ToolMobileGetContent200Response) GetFiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *ToolMobileGetContent200Response) GetFilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *ToolMobileGetContent200Response) SetFiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetFiles sets Files field to given value.


### GetJavascript

`func (o *ToolMobileGetContent200Response) GetJavascript() string`

GetJavascript returns the Javascript field if non-nil, zero value otherwise.

### GetJavascriptOk

`func (o *ToolMobileGetContent200Response) GetJavascriptOk() (*string, bool)`

GetJavascriptOk returns a tuple with the Javascript field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJavascript

`func (o *ToolMobileGetContent200Response) SetJavascript(v string)`

SetJavascript sets Javascript field to given value.


### GetOtherdata

`func (o *ToolMobileGetContent200Response) GetOtherdata() []ToolMobileGetContent200ResponseOtherdataInner`

GetOtherdata returns the Otherdata field if non-nil, zero value otherwise.

### GetOtherdataOk

`func (o *ToolMobileGetContent200Response) GetOtherdataOk() (*[]ToolMobileGetContent200ResponseOtherdataInner, bool)`

GetOtherdataOk returns a tuple with the Otherdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOtherdata

`func (o *ToolMobileGetContent200Response) SetOtherdata(v []ToolMobileGetContent200ResponseOtherdataInner)`

SetOtherdata sets Otherdata field to given value.


### GetRestrict

`func (o *ToolMobileGetContent200Response) GetRestrict() ToolMobileGetContent200ResponseRestrict`

GetRestrict returns the Restrict field if non-nil, zero value otherwise.

### GetRestrictOk

`func (o *ToolMobileGetContent200Response) GetRestrictOk() (*ToolMobileGetContent200ResponseRestrict, bool)`

GetRestrictOk returns a tuple with the Restrict field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRestrict

`func (o *ToolMobileGetContent200Response) SetRestrict(v ToolMobileGetContent200ResponseRestrict)`

SetRestrict sets Restrict field to given value.


### GetTemplates

`func (o *ToolMobileGetContent200Response) GetTemplates() []ToolMobileGetContent200ResponseTemplatesInner`

GetTemplates returns the Templates field if non-nil, zero value otherwise.

### GetTemplatesOk

`func (o *ToolMobileGetContent200Response) GetTemplatesOk() (*[]ToolMobileGetContent200ResponseTemplatesInner, bool)`

GetTemplatesOk returns a tuple with the Templates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplates

`func (o *ToolMobileGetContent200Response) SetTemplates(v []ToolMobileGetContent200ResponseTemplatesInner)`

SetTemplates sets Templates field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


