# ModWikiGetPageContents200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Page** | [**ModWikiGetPageContents200ResponsePage**](ModWikiGetPageContents200ResponsePage.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWikiGetPageContents200Response

`func NewModWikiGetPageContents200Response(page ModWikiGetPageContents200ResponsePage, ) *ModWikiGetPageContents200Response`

NewModWikiGetPageContents200Response instantiates a new ModWikiGetPageContents200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetPageContents200ResponseWithDefaults

`func NewModWikiGetPageContents200ResponseWithDefaults() *ModWikiGetPageContents200Response`

NewModWikiGetPageContents200ResponseWithDefaults instantiates a new ModWikiGetPageContents200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPage

`func (o *ModWikiGetPageContents200Response) GetPage() ModWikiGetPageContents200ResponsePage`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModWikiGetPageContents200Response) GetPageOk() (*ModWikiGetPageContents200ResponsePage, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModWikiGetPageContents200Response) SetPage(v ModWikiGetPageContents200ResponsePage)`

SetPage sets Page field to given value.


### GetWarnings

`func (o *ModWikiGetPageContents200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWikiGetPageContents200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWikiGetPageContents200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWikiGetPageContents200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


