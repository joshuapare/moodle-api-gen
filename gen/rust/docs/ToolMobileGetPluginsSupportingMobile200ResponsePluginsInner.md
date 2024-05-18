# ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addon** | Option<**String**> | The Mobile addon (package) name. | [optional][default to null]
**component** | Option<**String**> | The plugin component name. | [optional][default to null]
**dependencies** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> |  | [optional]
**filehash** | Option<**String**> | The addon package hash or empty if it doesn't exist. | [optional][default to null]
**filesize** | Option<**i32**> | The addon package size or empty if it doesn't exist. | [optional][default to null]
**fileurl** | Option<**String**> | The addon package url for download                                                             or empty if it doesn't exist. | [optional][default to null]
**handlers** | Option<**String**> | Handlers definition (JSON) | [optional][default to null]
**lang** | Option<**String**> | Language strings used by the handlers (JSON) | [optional][default to null]
**version** | Option<**String**> | The plugin version number. | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


