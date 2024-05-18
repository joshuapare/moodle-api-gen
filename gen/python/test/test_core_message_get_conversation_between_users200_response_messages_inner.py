# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_message_get_conversation_between_users200_response_messages_inner import CoreMessageGetConversationBetweenUsers200ResponseMessagesInner

class TestCoreMessageGetConversationBetweenUsers200ResponseMessagesInner(unittest.TestCase):
    """CoreMessageGetConversationBetweenUsers200ResponseMessagesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreMessageGetConversationBetweenUsers200ResponseMessagesInner:
        """Test CoreMessageGetConversationBetweenUsers200ResponseMessagesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreMessageGetConversationBetweenUsers200ResponseMessagesInner`
        """
        model = CoreMessageGetConversationBetweenUsers200ResponseMessagesInner()
        if include_optional:
            return CoreMessageGetConversationBetweenUsers200ResponseMessagesInner(
                id = 56,
                text = '',
                timecreated = 56,
                useridfrom = 56
            )
        else:
            return CoreMessageGetConversationBetweenUsers200ResponseMessagesInner(
        )
        """

    def testCoreMessageGetConversationBetweenUsers200ResponseMessagesInner(self):
        """Test CoreMessageGetConversationBetweenUsers200ResponseMessagesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
