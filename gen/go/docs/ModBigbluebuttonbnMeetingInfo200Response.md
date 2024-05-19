# ModBigbluebuttonbnMeetingInfo200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bigbluebuttonbnid** | **string** | bigbluebuttonbn instance id | [default to "null"]
**Canjoin** | **bool** | Can join | [default to null]
**Closingtime** | Pointer to **int32** | Closing time | [optional] [default to null]
**Cmid** | **int32** | CM id | [default to null]
**Features** | Pointer to [**[]ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner**](ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner.md) |  | [optional] 
**Groupid** | Pointer to **int32** | bigbluebuttonbn group id | [optional] [default to 0]
**Guestaccessenabled** | Pointer to **bool** | Guest access enabled | [optional] [default to null]
**Guestjoinurl** | Pointer to **string** | Guest URL | [optional] [default to "null"]
**Guestpassword** | Pointer to **string** | Guest join password | [optional] [default to "null"]
**Ismoderator** | **bool** | Is moderator | [default to null]
**Joinurl** | **string** | Join URL | [default to "null"]
**Meetingid** | **string** | Meeting id | 
**Moderatorcount** | Pointer to **int32** | Moderator count | [optional] [default to null]
**Moderatorplural** | Pointer to **bool** | Several moderators ? | [optional] [default to null]
**Openingtime** | Pointer to **int32** | Opening time | [optional] [default to null]
**Participantcount** | Pointer to **int32** | Participant count | [optional] [default to null]
**Participantplural** | Pointer to **bool** | Several participants ? | [optional] [default to null]
**Presentations** | [**[]ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner**](ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.md) |  | 
**Startedat** | Pointer to **int32** | Started at | [optional] [default to null]
**Statusclosed** | Pointer to **bool** | Status closed | [optional] [default to null]
**Statusmessage** | Pointer to **string** | Status message | [optional] [default to "null"]
**Statusopen** | Pointer to **bool** | Status open | [optional] [default to null]
**Statusrunning** | Pointer to **bool** | Status running | [optional] [default to null]
**Userlimit** | **int32** | User limit | [default to null]

## Methods

### NewModBigbluebuttonbnMeetingInfo200Response

`func NewModBigbluebuttonbnMeetingInfo200Response(bigbluebuttonbnid string, canjoin bool, cmid int32, ismoderator bool, joinurl string, meetingid string, presentations []ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner, userlimit int32, ) *ModBigbluebuttonbnMeetingInfo200Response`

NewModBigbluebuttonbnMeetingInfo200Response instantiates a new ModBigbluebuttonbnMeetingInfo200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBigbluebuttonbnMeetingInfo200ResponseWithDefaults

`func NewModBigbluebuttonbnMeetingInfo200ResponseWithDefaults() *ModBigbluebuttonbnMeetingInfo200Response`

NewModBigbluebuttonbnMeetingInfo200ResponseWithDefaults instantiates a new ModBigbluebuttonbnMeetingInfo200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBigbluebuttonbnid

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetBigbluebuttonbnid() string`

GetBigbluebuttonbnid returns the Bigbluebuttonbnid field if non-nil, zero value otherwise.

### GetBigbluebuttonbnidOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetBigbluebuttonbnidOk() (*string, bool)`

GetBigbluebuttonbnidOk returns a tuple with the Bigbluebuttonbnid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBigbluebuttonbnid

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetBigbluebuttonbnid(v string)`

SetBigbluebuttonbnid sets Bigbluebuttonbnid field to given value.


### GetCanjoin

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetCanjoin() bool`

GetCanjoin returns the Canjoin field if non-nil, zero value otherwise.

### GetCanjoinOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetCanjoinOk() (*bool, bool)`

GetCanjoinOk returns a tuple with the Canjoin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanjoin

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetCanjoin(v bool)`

SetCanjoin sets Canjoin field to given value.


### GetClosingtime

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetClosingtime() int32`

GetClosingtime returns the Closingtime field if non-nil, zero value otherwise.

### GetClosingtimeOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetClosingtimeOk() (*int32, bool)`

GetClosingtimeOk returns a tuple with the Closingtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClosingtime

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetClosingtime(v int32)`

SetClosingtime sets Closingtime field to given value.

### HasClosingtime

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasClosingtime() bool`

HasClosingtime returns a boolean if a field has been set.

### GetCmid

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetFeatures

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetFeatures() []ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner`

GetFeatures returns the Features field if non-nil, zero value otherwise.

### GetFeaturesOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetFeaturesOk() (*[]ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner, bool)`

GetFeaturesOk returns a tuple with the Features field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeatures

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetFeatures(v []ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner)`

SetFeatures sets Features field to given value.

### HasFeatures

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasFeatures() bool`

HasFeatures returns a boolean if a field has been set.

### GetGroupid

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetGuestaccessenabled

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetGuestaccessenabled() bool`

GetGuestaccessenabled returns the Guestaccessenabled field if non-nil, zero value otherwise.

### GetGuestaccessenabledOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetGuestaccessenabledOk() (*bool, bool)`

GetGuestaccessenabledOk returns a tuple with the Guestaccessenabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestaccessenabled

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetGuestaccessenabled(v bool)`

SetGuestaccessenabled sets Guestaccessenabled field to given value.

### HasGuestaccessenabled

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasGuestaccessenabled() bool`

HasGuestaccessenabled returns a boolean if a field has been set.

### GetGuestjoinurl

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetGuestjoinurl() string`

GetGuestjoinurl returns the Guestjoinurl field if non-nil, zero value otherwise.

### GetGuestjoinurlOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetGuestjoinurlOk() (*string, bool)`

GetGuestjoinurlOk returns a tuple with the Guestjoinurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestjoinurl

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetGuestjoinurl(v string)`

SetGuestjoinurl sets Guestjoinurl field to given value.

### HasGuestjoinurl

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasGuestjoinurl() bool`

HasGuestjoinurl returns a boolean if a field has been set.

### GetGuestpassword

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetGuestpassword() string`

GetGuestpassword returns the Guestpassword field if non-nil, zero value otherwise.

### GetGuestpasswordOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetGuestpasswordOk() (*string, bool)`

GetGuestpasswordOk returns a tuple with the Guestpassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestpassword

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetGuestpassword(v string)`

SetGuestpassword sets Guestpassword field to given value.

### HasGuestpassword

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasGuestpassword() bool`

HasGuestpassword returns a boolean if a field has been set.

### GetIsmoderator

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetIsmoderator() bool`

GetIsmoderator returns the Ismoderator field if non-nil, zero value otherwise.

### GetIsmoderatorOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetIsmoderatorOk() (*bool, bool)`

GetIsmoderatorOk returns a tuple with the Ismoderator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsmoderator

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetIsmoderator(v bool)`

SetIsmoderator sets Ismoderator field to given value.


### GetJoinurl

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetJoinurl() string`

GetJoinurl returns the Joinurl field if non-nil, zero value otherwise.

### GetJoinurlOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetJoinurlOk() (*string, bool)`

GetJoinurlOk returns a tuple with the Joinurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJoinurl

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetJoinurl(v string)`

SetJoinurl sets Joinurl field to given value.


### GetMeetingid

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetMeetingid() string`

GetMeetingid returns the Meetingid field if non-nil, zero value otherwise.

### GetMeetingidOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetMeetingidOk() (*string, bool)`

GetMeetingidOk returns a tuple with the Meetingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeetingid

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetMeetingid(v string)`

SetMeetingid sets Meetingid field to given value.


### GetModeratorcount

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetModeratorcount() int32`

GetModeratorcount returns the Moderatorcount field if non-nil, zero value otherwise.

### GetModeratorcountOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetModeratorcountOk() (*int32, bool)`

GetModeratorcountOk returns a tuple with the Moderatorcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModeratorcount

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetModeratorcount(v int32)`

SetModeratorcount sets Moderatorcount field to given value.

### HasModeratorcount

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasModeratorcount() bool`

HasModeratorcount returns a boolean if a field has been set.

### GetModeratorplural

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetModeratorplural() bool`

GetModeratorplural returns the Moderatorplural field if non-nil, zero value otherwise.

### GetModeratorpluralOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetModeratorpluralOk() (*bool, bool)`

GetModeratorpluralOk returns a tuple with the Moderatorplural field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModeratorplural

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetModeratorplural(v bool)`

SetModeratorplural sets Moderatorplural field to given value.

### HasModeratorplural

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasModeratorplural() bool`

HasModeratorplural returns a boolean if a field has been set.

### GetOpeningtime

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetOpeningtime() int32`

GetOpeningtime returns the Openingtime field if non-nil, zero value otherwise.

### GetOpeningtimeOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetOpeningtimeOk() (*int32, bool)`

GetOpeningtimeOk returns a tuple with the Openingtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOpeningtime

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetOpeningtime(v int32)`

SetOpeningtime sets Openingtime field to given value.

### HasOpeningtime

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasOpeningtime() bool`

HasOpeningtime returns a boolean if a field has been set.

### GetParticipantcount

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetParticipantcount() int32`

GetParticipantcount returns the Participantcount field if non-nil, zero value otherwise.

### GetParticipantcountOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetParticipantcountOk() (*int32, bool)`

GetParticipantcountOk returns a tuple with the Participantcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParticipantcount

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetParticipantcount(v int32)`

SetParticipantcount sets Participantcount field to given value.

### HasParticipantcount

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasParticipantcount() bool`

HasParticipantcount returns a boolean if a field has been set.

### GetParticipantplural

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetParticipantplural() bool`

GetParticipantplural returns the Participantplural field if non-nil, zero value otherwise.

### GetParticipantpluralOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetParticipantpluralOk() (*bool, bool)`

GetParticipantpluralOk returns a tuple with the Participantplural field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParticipantplural

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetParticipantplural(v bool)`

SetParticipantplural sets Participantplural field to given value.

### HasParticipantplural

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasParticipantplural() bool`

HasParticipantplural returns a boolean if a field has been set.

### GetPresentations

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetPresentations() []ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner`

GetPresentations returns the Presentations field if non-nil, zero value otherwise.

### GetPresentationsOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetPresentationsOk() (*[]ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner, bool)`

GetPresentationsOk returns a tuple with the Presentations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPresentations

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetPresentations(v []ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner)`

SetPresentations sets Presentations field to given value.


### GetStartedat

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStartedat() int32`

GetStartedat returns the Startedat field if non-nil, zero value otherwise.

### GetStartedatOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStartedatOk() (*int32, bool)`

GetStartedatOk returns a tuple with the Startedat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartedat

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetStartedat(v int32)`

SetStartedat sets Startedat field to given value.

### HasStartedat

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasStartedat() bool`

HasStartedat returns a boolean if a field has been set.

### GetStatusclosed

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStatusclosed() bool`

GetStatusclosed returns the Statusclosed field if non-nil, zero value otherwise.

### GetStatusclosedOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStatusclosedOk() (*bool, bool)`

GetStatusclosedOk returns a tuple with the Statusclosed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusclosed

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetStatusclosed(v bool)`

SetStatusclosed sets Statusclosed field to given value.

### HasStatusclosed

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasStatusclosed() bool`

HasStatusclosed returns a boolean if a field has been set.

### GetStatusmessage

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStatusmessage() string`

GetStatusmessage returns the Statusmessage field if non-nil, zero value otherwise.

### GetStatusmessageOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStatusmessageOk() (*string, bool)`

GetStatusmessageOk returns a tuple with the Statusmessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusmessage

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetStatusmessage(v string)`

SetStatusmessage sets Statusmessage field to given value.

### HasStatusmessage

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasStatusmessage() bool`

HasStatusmessage returns a boolean if a field has been set.

### GetStatusopen

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStatusopen() bool`

GetStatusopen returns the Statusopen field if non-nil, zero value otherwise.

### GetStatusopenOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStatusopenOk() (*bool, bool)`

GetStatusopenOk returns a tuple with the Statusopen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusopen

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetStatusopen(v bool)`

SetStatusopen sets Statusopen field to given value.

### HasStatusopen

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasStatusopen() bool`

HasStatusopen returns a boolean if a field has been set.

### GetStatusrunning

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStatusrunning() bool`

GetStatusrunning returns the Statusrunning field if non-nil, zero value otherwise.

### GetStatusrunningOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetStatusrunningOk() (*bool, bool)`

GetStatusrunningOk returns a tuple with the Statusrunning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusrunning

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetStatusrunning(v bool)`

SetStatusrunning sets Statusrunning field to given value.

### HasStatusrunning

`func (o *ModBigbluebuttonbnMeetingInfo200Response) HasStatusrunning() bool`

HasStatusrunning returns a boolean if a field has been set.

### GetUserlimit

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetUserlimit() int32`

GetUserlimit returns the Userlimit field if non-nil, zero value otherwise.

### GetUserlimitOk

`func (o *ModBigbluebuttonbnMeetingInfo200Response) GetUserlimitOk() (*int32, bool)`

GetUserlimitOk returns a tuple with the Userlimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserlimit

`func (o *ModBigbluebuttonbnMeetingInfo200Response) SetUserlimit(v int32)`

SetUserlimit sets Userlimit field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


