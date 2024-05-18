# ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Addon** | Pointer to **string** | The Mobile addon (package) name. | [optional] [default to "null"]
**Component** | Pointer to **string** | The plugin component name. | [optional] [default to "null"]
**Dependencies** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Filehash** | Pointer to **string** | The addon package hash or empty if it doesn&#39;t exist. | [optional] [default to "null"]
**Filesize** | Pointer to **int32** | The addon package size or empty if it doesn&#39;t exist. | [optional] [default to null]
**Fileurl** | Pointer to **string** | The addon package url for download                                                             or empty if it doesn&#39;t exist. | [optional] [default to "null"]
**Handlers** | Pointer to **string** | Handlers definition (JSON) | [optional] [default to "null"]
**Lang** | Pointer to **string** | Language strings used by the handlers (JSON) | [optional] [default to "null"]
**Version** | Pointer to **string** | The plugin version number. | [optional] [default to "null"]

## Methods

### NewToolMobileGetPluginsSupportingMobile200ResponsePluginsInner

`func NewToolMobileGetPluginsSupportingMobile200ResponsePluginsInner() *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner`

NewToolMobileGetPluginsSupportingMobile200ResponsePluginsInner instantiates a new ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMobileGetPluginsSupportingMobile200ResponsePluginsInnerWithDefaults

`func NewToolMobileGetPluginsSupportingMobile200ResponsePluginsInnerWithDefaults() *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner`

NewToolMobileGetPluginsSupportingMobile200ResponsePluginsInnerWithDefaults instantiates a new ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddon

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetAddon() string`

GetAddon returns the Addon field if non-nil, zero value otherwise.

### GetAddonOk

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetAddonOk() (*string, bool)`

GetAddonOk returns a tuple with the Addon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddon

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) SetAddon(v string)`

SetAddon sets Addon field to given value.

### HasAddon

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) HasAddon() bool`

HasAddon returns a boolean if a field has been set.

### GetComponent

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetDependencies

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetDependencies() []map[string]interface{}`

GetDependencies returns the Dependencies field if non-nil, zero value otherwise.

### GetDependenciesOk

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetDependenciesOk() (*[]map[string]interface{}, bool)`

GetDependenciesOk returns a tuple with the Dependencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDependencies

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) SetDependencies(v []map[string]interface{})`

SetDependencies sets Dependencies field to given value.

### HasDependencies

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) HasDependencies() bool`

HasDependencies returns a boolean if a field has been set.

### GetFilehash

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetFilehash() string`

GetFilehash returns the Filehash field if non-nil, zero value otherwise.

### GetFilehashOk

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetFilehashOk() (*string, bool)`

GetFilehashOk returns a tuple with the Filehash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilehash

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) SetFilehash(v string)`

SetFilehash sets Filehash field to given value.

### HasFilehash

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) HasFilehash() bool`

HasFilehash returns a boolean if a field has been set.

### GetFilesize

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetFilesize() int32`

GetFilesize returns the Filesize field if non-nil, zero value otherwise.

### GetFilesizeOk

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetFilesizeOk() (*int32, bool)`

GetFilesizeOk returns a tuple with the Filesize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilesize

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) SetFilesize(v int32)`

SetFilesize sets Filesize field to given value.

### HasFilesize

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) HasFilesize() bool`

HasFilesize returns a boolean if a field has been set.

### GetFileurl

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetFileurl() string`

GetFileurl returns the Fileurl field if non-nil, zero value otherwise.

### GetFileurlOk

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetFileurlOk() (*string, bool)`

GetFileurlOk returns a tuple with the Fileurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileurl

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) SetFileurl(v string)`

SetFileurl sets Fileurl field to given value.

### HasFileurl

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) HasFileurl() bool`

HasFileurl returns a boolean if a field has been set.

### GetHandlers

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetHandlers() string`

GetHandlers returns the Handlers field if non-nil, zero value otherwise.

### GetHandlersOk

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetHandlersOk() (*string, bool)`

GetHandlersOk returns a tuple with the Handlers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHandlers

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) SetHandlers(v string)`

SetHandlers sets Handlers field to given value.

### HasHandlers

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) HasHandlers() bool`

HasHandlers returns a boolean if a field has been set.

### GetLang

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetVersion

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


