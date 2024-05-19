# ModScormGetScormScoes200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Scoes** | [**[]ModScormGetScormScoes200ResponseScoesInner**](ModScormGetScormScoes200ResponseScoesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModScormGetScormScoes200Response

`func NewModScormGetScormScoes200Response(scoes []ModScormGetScormScoes200ResponseScoesInner, ) *ModScormGetScormScoes200Response`

NewModScormGetScormScoes200Response instantiates a new ModScormGetScormScoes200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModScormGetScormScoes200ResponseWithDefaults

`func NewModScormGetScormScoes200ResponseWithDefaults() *ModScormGetScormScoes200Response`

NewModScormGetScormScoes200ResponseWithDefaults instantiates a new ModScormGetScormScoes200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetScoes

`func (o *ModScormGetScormScoes200Response) GetScoes() []ModScormGetScormScoes200ResponseScoesInner`

GetScoes returns the Scoes field if non-nil, zero value otherwise.

### GetScoesOk

`func (o *ModScormGetScormScoes200Response) GetScoesOk() (*[]ModScormGetScormScoes200ResponseScoesInner, bool)`

GetScoesOk returns a tuple with the Scoes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScoes

`func (o *ModScormGetScormScoes200Response) SetScoes(v []ModScormGetScormScoes200ResponseScoesInner)`

SetScoes sets Scoes field to given value.


### GetWarnings

`func (o *ModScormGetScormScoes200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModScormGetScormScoes200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModScormGetScormScoes200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModScormGetScormScoes200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


