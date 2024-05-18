# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_forum_set_pin_state200_response import ModForumSetPinState200Response

class TestModForumSetPinState200Response(unittest.TestCase):
    """ModForumSetPinState200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModForumSetPinState200Response:
        """Test ModForumSetPinState200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModForumSetPinState200Response`
        """
        model = ModForumSetPinState200Response()
        if include_optional:
            return ModForumSetPinState200Response(
                capabilities = openapi_client.models.mod_forum_set_pin_state_200_response_capabilities.mod_forum_set_pin_state_200_response_capabilities(
                    favourite = True, 
                    manage = True, 
                    move = True, 
                    pin = True, 
                    post = True, 
                    subscribe = True, ),
                firstpostid = 56,
                forumid = 56,
                group = openapi_client.models.mod_forum_set_pin_state_200_response_group.mod_forum_set_pin_state_200_response_group(
                    name = '', 
                    urls = openapi_client.models.mod_forum_set_pin_state_200_response_group_urls.mod_forum_set_pin_state_200_response_group_urls(
                        picture = 'null', 
                        userlist = 'null', ), ),
                id = 56,
                istimelocked = True,
                locked = True,
                name = '',
                pinned = True,
                timed = openapi_client.models.mod_forum_set_pin_state_200_response_timed.mod_forum_set_pin_state_200_response_timed(
                    istimed = True, 
                    visible = True, ),
                times = openapi_client.models.mod_forum_set_pin_state_200_response_times.mod_forum_set_pin_state_200_response_times(
                    end = 56, 
                    locked = 56, 
                    modified = 56, 
                    start = 56, ),
                urls = openapi_client.models.mod_forum_set_pin_state_200_response_urls.mod_forum_set_pin_state_200_response_urls(
                    markasread = 'null', 
                    pin = 'null', 
                    subscribe = 'null', 
                    view = '', 
                    viewfirstunread = 'null', 
                    viewlatest = 'null', ),
                userstate = openapi_client.models.mod_forum_set_pin_state_200_response_userstate.mod_forum_set_pin_state_200_response_userstate(
                    favourited = True, 
                    subscribed = True, )
            )
        else:
            return ModForumSetPinState200Response(
                capabilities = openapi_client.models.mod_forum_set_pin_state_200_response_capabilities.mod_forum_set_pin_state_200_response_capabilities(
                    favourite = True, 
                    manage = True, 
                    move = True, 
                    pin = True, 
                    post = True, 
                    subscribe = True, ),
                firstpostid = 56,
                forumid = 56,
                id = 56,
                istimelocked = True,
                locked = True,
                name = '',
                pinned = True,
                timed = openapi_client.models.mod_forum_set_pin_state_200_response_timed.mod_forum_set_pin_state_200_response_timed(
                    istimed = True, 
                    visible = True, ),
                times = openapi_client.models.mod_forum_set_pin_state_200_response_times.mod_forum_set_pin_state_200_response_times(
                    end = 56, 
                    locked = 56, 
                    modified = 56, 
                    start = 56, ),
                urls = openapi_client.models.mod_forum_set_pin_state_200_response_urls.mod_forum_set_pin_state_200_response_urls(
                    markasread = 'null', 
                    pin = 'null', 
                    subscribe = 'null', 
                    view = '', 
                    viewfirstunread = 'null', 
                    viewlatest = 'null', ),
                userstate = openapi_client.models.mod_forum_set_pin_state_200_response_userstate.mod_forum_set_pin_state_200_response_userstate(
                    favourited = True, 
                    subscribed = True, ),
        )
        """

    def testModForumSetPinState200Response(self):
        """Test ModForumSetPinState200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()