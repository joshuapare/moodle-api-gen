# CoreTableGetDynamicTableContent200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Html** | **string** | The raw html of the requested table. | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreTableGetDynamicTableContent200Response

`func NewCoreTableGetDynamicTableContent200Response(html string, ) *CoreTableGetDynamicTableContent200Response`

NewCoreTableGetDynamicTableContent200Response instantiates a new CoreTableGetDynamicTableContent200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTableGetDynamicTableContent200ResponseWithDefaults

`func NewCoreTableGetDynamicTableContent200ResponseWithDefaults() *CoreTableGetDynamicTableContent200Response`

NewCoreTableGetDynamicTableContent200ResponseWithDefaults instantiates a new CoreTableGetDynamicTableContent200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHtml

`func (o *CoreTableGetDynamicTableContent200Response) GetHtml() string`

GetHtml returns the Html field if non-nil, zero value otherwise.

### GetHtmlOk

`func (o *CoreTableGetDynamicTableContent200Response) GetHtmlOk() (*string, bool)`

GetHtmlOk returns a tuple with the Html field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtml

`func (o *CoreTableGetDynamicTableContent200Response) SetHtml(v string)`

SetHtml sets Html field to given value.


### GetWarnings

`func (o *CoreTableGetDynamicTableContent200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreTableGetDynamicTableContent200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreTableGetDynamicTableContent200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreTableGetDynamicTableContent200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


