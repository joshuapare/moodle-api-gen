# CoreH5pGetTrustedH5pFileRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Copyright** | Pointer to **int32** | The copyright option | [optional] [default to 0]
**Embed** | Pointer to **int32** | The embed allow to copy the code to your site | [optional] [default to 0]
**Export** | Pointer to **int32** | The export allow to download the package | [optional] [default to 0]
**Frame** | Pointer to **int32** | The frame allow to show the bar options below the content | [optional] [default to 0]
**Url** | **string** | H5P file url. | [default to "null"]

## Methods

### NewCoreH5pGetTrustedH5pFileRequest

`func NewCoreH5pGetTrustedH5pFileRequest(url string, ) *CoreH5pGetTrustedH5pFileRequest`

NewCoreH5pGetTrustedH5pFileRequest instantiates a new CoreH5pGetTrustedH5pFileRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreH5pGetTrustedH5pFileRequestWithDefaults

`func NewCoreH5pGetTrustedH5pFileRequestWithDefaults() *CoreH5pGetTrustedH5pFileRequest`

NewCoreH5pGetTrustedH5pFileRequestWithDefaults instantiates a new CoreH5pGetTrustedH5pFileRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCopyright

`func (o *CoreH5pGetTrustedH5pFileRequest) GetCopyright() int32`

GetCopyright returns the Copyright field if non-nil, zero value otherwise.

### GetCopyrightOk

`func (o *CoreH5pGetTrustedH5pFileRequest) GetCopyrightOk() (*int32, bool)`

GetCopyrightOk returns a tuple with the Copyright field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCopyright

`func (o *CoreH5pGetTrustedH5pFileRequest) SetCopyright(v int32)`

SetCopyright sets Copyright field to given value.

### HasCopyright

`func (o *CoreH5pGetTrustedH5pFileRequest) HasCopyright() bool`

HasCopyright returns a boolean if a field has been set.

### GetEmbed

`func (o *CoreH5pGetTrustedH5pFileRequest) GetEmbed() int32`

GetEmbed returns the Embed field if non-nil, zero value otherwise.

### GetEmbedOk

`func (o *CoreH5pGetTrustedH5pFileRequest) GetEmbedOk() (*int32, bool)`

GetEmbedOk returns a tuple with the Embed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmbed

`func (o *CoreH5pGetTrustedH5pFileRequest) SetEmbed(v int32)`

SetEmbed sets Embed field to given value.

### HasEmbed

`func (o *CoreH5pGetTrustedH5pFileRequest) HasEmbed() bool`

HasEmbed returns a boolean if a field has been set.

### GetExport

`func (o *CoreH5pGetTrustedH5pFileRequest) GetExport() int32`

GetExport returns the Export field if non-nil, zero value otherwise.

### GetExportOk

`func (o *CoreH5pGetTrustedH5pFileRequest) GetExportOk() (*int32, bool)`

GetExportOk returns a tuple with the Export field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExport

`func (o *CoreH5pGetTrustedH5pFileRequest) SetExport(v int32)`

SetExport sets Export field to given value.

### HasExport

`func (o *CoreH5pGetTrustedH5pFileRequest) HasExport() bool`

HasExport returns a boolean if a field has been set.

### GetFrame

`func (o *CoreH5pGetTrustedH5pFileRequest) GetFrame() int32`

GetFrame returns the Frame field if non-nil, zero value otherwise.

### GetFrameOk

`func (o *CoreH5pGetTrustedH5pFileRequest) GetFrameOk() (*int32, bool)`

GetFrameOk returns a tuple with the Frame field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrame

`func (o *CoreH5pGetTrustedH5pFileRequest) SetFrame(v int32)`

SetFrame sets Frame field to given value.

### HasFrame

`func (o *CoreH5pGetTrustedH5pFileRequest) HasFrame() bool`

HasFrame returns a boolean if a field has been set.

### GetUrl

`func (o *CoreH5pGetTrustedH5pFileRequest) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreH5pGetTrustedH5pFileRequest) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreH5pGetTrustedH5pFileRequest) SetUrl(v string)`

SetUrl sets Url field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


