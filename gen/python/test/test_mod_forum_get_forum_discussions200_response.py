# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_forum_get_forum_discussions200_response import ModForumGetForumDiscussions200Response

class TestModForumGetForumDiscussions200Response(unittest.TestCase):
    """ModForumGetForumDiscussions200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModForumGetForumDiscussions200Response:
        """Test ModForumGetForumDiscussions200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModForumGetForumDiscussions200Response`
        """
        model = ModForumGetForumDiscussions200Response()
        if include_optional:
            return ModForumGetForumDiscussions200Response(
                discussions = [
                    openapi_client.models.mod_forum_get_forum_discussions_200_response_discussions_inner.mod_forum_get_forum_discussions_200_response_discussions_inner(
                        attachment = 'null', 
                        attachments = [
                            openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
                                filename = '', 
                                filepath = '', 
                                filesize = 56, 
                                fileurl = '', 
                                isexternalfile = True, 
                                mimetype = '', 
                                repositorytype = '', 
                                timemodified = 56, )
                            ], 
                        canfavourite = True, 
                        canlock = True, 
                        canreply = True, 
                        created = 56, 
                        discussion = 56, 
                        groupid = 56, 
                        id = 56, 
                        locked = True, 
                        mailed = 56, 
                        mailnow = 56, 
                        message = 'null', 
                        messageformat = 56, 
                        messageinlinefiles = [
                            openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
                                filename = '', 
                                filepath = '', 
                                filesize = 56, 
                                fileurl = '', 
                                isexternalfile = True, 
                                mimetype = '', 
                                repositorytype = '', 
                                timemodified = 56, )
                            ], 
                        messagetrust = 56, 
                        modified = 56, 
                        name = 'null', 
                        numreplies = 56, 
                        numunread = 56, 
                        parent = 56, 
                        pinned = True, 
                        starred = True, 
                        subject = 'null', 
                        timeend = 56, 
                        timemodified = 56, 
                        timestart = 56, 
                        totalscore = 56, 
                        userfullname = 'null', 
                        userid = 56, 
                        usermodified = 56, 
                        usermodifiedfullname = 'null', 
                        usermodifiedpictureurl = 'null', 
                        userpictureurl = 'null', )
                    ],
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return ModForumGetForumDiscussions200Response(
                discussions = [
                    openapi_client.models.mod_forum_get_forum_discussions_200_response_discussions_inner.mod_forum_get_forum_discussions_200_response_discussions_inner(
                        attachment = 'null', 
                        attachments = [
                            openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
                                filename = '', 
                                filepath = '', 
                                filesize = 56, 
                                fileurl = '', 
                                isexternalfile = True, 
                                mimetype = '', 
                                repositorytype = '', 
                                timemodified = 56, )
                            ], 
                        canfavourite = True, 
                        canlock = True, 
                        canreply = True, 
                        created = 56, 
                        discussion = 56, 
                        groupid = 56, 
                        id = 56, 
                        locked = True, 
                        mailed = 56, 
                        mailnow = 56, 
                        message = 'null', 
                        messageformat = 56, 
                        messageinlinefiles = [
                            openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
                                filename = '', 
                                filepath = '', 
                                filesize = 56, 
                                fileurl = '', 
                                isexternalfile = True, 
                                mimetype = '', 
                                repositorytype = '', 
                                timemodified = 56, )
                            ], 
                        messagetrust = 56, 
                        modified = 56, 
                        name = 'null', 
                        numreplies = 56, 
                        numunread = 56, 
                        parent = 56, 
                        pinned = True, 
                        starred = True, 
                        subject = 'null', 
                        timeend = 56, 
                        timemodified = 56, 
                        timestart = 56, 
                        totalscore = 56, 
                        userfullname = 'null', 
                        userid = 56, 
                        usermodified = 56, 
                        usermodifiedfullname = 'null', 
                        usermodifiedpictureurl = 'null', 
                        userpictureurl = 'null', )
                    ],
        )
        """

    def testModForumGetForumDiscussions200Response(self):
        """Test ModForumGetForumDiscussions200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()