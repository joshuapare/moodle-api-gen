# ModWikiGetSubwikis200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Subwikis** | [**[]ModWikiGetSubwikis200ResponseSubwikisInner**](ModWikiGetSubwikis200ResponseSubwikisInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModWikiGetSubwikis200Response

`func NewModWikiGetSubwikis200Response(subwikis []ModWikiGetSubwikis200ResponseSubwikisInner, ) *ModWikiGetSubwikis200Response`

NewModWikiGetSubwikis200Response instantiates a new ModWikiGetSubwikis200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetSubwikis200ResponseWithDefaults

`func NewModWikiGetSubwikis200ResponseWithDefaults() *ModWikiGetSubwikis200Response`

NewModWikiGetSubwikis200ResponseWithDefaults instantiates a new ModWikiGetSubwikis200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSubwikis

`func (o *ModWikiGetSubwikis200Response) GetSubwikis() []ModWikiGetSubwikis200ResponseSubwikisInner`

GetSubwikis returns the Subwikis field if non-nil, zero value otherwise.

### GetSubwikisOk

`func (o *ModWikiGetSubwikis200Response) GetSubwikisOk() (*[]ModWikiGetSubwikis200ResponseSubwikisInner, bool)`

GetSubwikisOk returns a tuple with the Subwikis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubwikis

`func (o *ModWikiGetSubwikis200Response) SetSubwikis(v []ModWikiGetSubwikis200ResponseSubwikisInner)`

SetSubwikis sets Subwikis field to given value.


### GetWarnings

`func (o *ModWikiGetSubwikis200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWikiGetSubwikis200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWikiGetSubwikis200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWikiGetSubwikis200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


