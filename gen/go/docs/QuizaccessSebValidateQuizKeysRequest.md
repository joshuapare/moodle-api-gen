# QuizaccessSebValidateQuizKeysRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Browserexamkey** | Pointer to **string** | SEB browser exam key | [optional] [default to "null"]
**Cmid** | **int32** | Course module ID | [default to null]
**Configkey** | Pointer to **string** | SEB config key | [optional] [default to "null"]
**Url** | **string** | Page URL to check | [default to "null"]

## Methods

### NewQuizaccessSebValidateQuizKeysRequest

`func NewQuizaccessSebValidateQuizKeysRequest(cmid int32, url string, ) *QuizaccessSebValidateQuizKeysRequest`

NewQuizaccessSebValidateQuizKeysRequest instantiates a new QuizaccessSebValidateQuizKeysRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQuizaccessSebValidateQuizKeysRequestWithDefaults

`func NewQuizaccessSebValidateQuizKeysRequestWithDefaults() *QuizaccessSebValidateQuizKeysRequest`

NewQuizaccessSebValidateQuizKeysRequestWithDefaults instantiates a new QuizaccessSebValidateQuizKeysRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBrowserexamkey

`func (o *QuizaccessSebValidateQuizKeysRequest) GetBrowserexamkey() string`

GetBrowserexamkey returns the Browserexamkey field if non-nil, zero value otherwise.

### GetBrowserexamkeyOk

`func (o *QuizaccessSebValidateQuizKeysRequest) GetBrowserexamkeyOk() (*string, bool)`

GetBrowserexamkeyOk returns a tuple with the Browserexamkey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrowserexamkey

`func (o *QuizaccessSebValidateQuizKeysRequest) SetBrowserexamkey(v string)`

SetBrowserexamkey sets Browserexamkey field to given value.

### HasBrowserexamkey

`func (o *QuizaccessSebValidateQuizKeysRequest) HasBrowserexamkey() bool`

HasBrowserexamkey returns a boolean if a field has been set.

### GetCmid

`func (o *QuizaccessSebValidateQuizKeysRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *QuizaccessSebValidateQuizKeysRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *QuizaccessSebValidateQuizKeysRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetConfigkey

`func (o *QuizaccessSebValidateQuizKeysRequest) GetConfigkey() string`

GetConfigkey returns the Configkey field if non-nil, zero value otherwise.

### GetConfigkeyOk

`func (o *QuizaccessSebValidateQuizKeysRequest) GetConfigkeyOk() (*string, bool)`

GetConfigkeyOk returns a tuple with the Configkey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConfigkey

`func (o *QuizaccessSebValidateQuizKeysRequest) SetConfigkey(v string)`

SetConfigkey sets Configkey field to given value.

### HasConfigkey

`func (o *QuizaccessSebValidateQuizKeysRequest) HasConfigkey() bool`

HasConfigkey returns a boolean if a field has been set.

### GetUrl

`func (o *QuizaccessSebValidateQuizKeysRequest) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *QuizaccessSebValidateQuizKeysRequest) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *QuizaccessSebValidateQuizKeysRequest) SetUrl(v string)`

SetUrl sets Url field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


