# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_message_get_conversation_between_users200_response_members_inner import CoreMessageGetConversationBetweenUsers200ResponseMembersInner

class TestCoreMessageGetConversationBetweenUsers200ResponseMembersInner(unittest.TestCase):
    """CoreMessageGetConversationBetweenUsers200ResponseMembersInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreMessageGetConversationBetweenUsers200ResponseMembersInner:
        """Test CoreMessageGetConversationBetweenUsers200ResponseMembersInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreMessageGetConversationBetweenUsers200ResponseMembersInner`
        """
        model = CoreMessageGetConversationBetweenUsers200ResponseMembersInner()
        if include_optional:
            return CoreMessageGetConversationBetweenUsers200ResponseMembersInner(
                canmessage = True,
                canmessageevenifblocked = True,
                contactrequests = [
                    openapi_client.models.core_message_get_conversation_between_users_200_response_members_inner_contactrequests_inner.core_message_get_conversation_between_users_200_response_members_inner_contactrequests_inner(
                        id = 56, 
                        requesteduserid = 56, 
                        timecreated = 56, 
                        userid = 56, )
                    ],
                conversations = [
                    openapi_client.models.core_message_get_conversation_between_users_200_response_members_inner_conversations_inner.core_message_get_conversation_between_users_200_response_members_inner_conversations_inner(
                        id = 56, 
                        name = '', 
                        timecreated = 56, 
                        type = 56, )
                    ],
                fullname = '',
                id = 56,
                isblocked = True,
                iscontact = True,
                isdeleted = True,
                isonline = True,
                profileimageurl = '',
                profileimageurlsmall = '',
                profileurl = '',
                requirescontact = True,
                showonlinestatus = True
            )
        else:
            return CoreMessageGetConversationBetweenUsers200ResponseMembersInner(
        )
        """

    def testCoreMessageGetConversationBetweenUsers200ResponseMembersInner(self):
        """Test CoreMessageGetConversationBetweenUsers200ResponseMembersInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
