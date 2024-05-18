# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_forum_get_discussion_posts_by_userid200_response import ModForumGetDiscussionPostsByUserid200Response

class TestModForumGetDiscussionPostsByUserid200Response(unittest.TestCase):
    """ModForumGetDiscussionPostsByUserid200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModForumGetDiscussionPostsByUserid200Response:
        """Test ModForumGetDiscussionPostsByUserid200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModForumGetDiscussionPostsByUserid200Response`
        """
        model = ModForumGetDiscussionPostsByUserid200Response()
        if include_optional:
            return ModForumGetDiscussionPostsByUserid200Response(
                discussions = [
                    openapi_client.models.mod_forum_get_discussion_posts_by_userid_200_response_discussions_inner.mod_forum_get_discussion_posts_by_userid_200_response_discussions_inner(
                        authorfullname = 'null', 
                        id = 56, 
                        name = 'null', 
                        posts = openapi_client.models.mod_forum_get_discussion_posts_by_userid_200_response_discussions_inner_posts.mod_forum_get_discussion_posts_by_userid_200_response_discussions_inner_posts(
                            parentposts = [
                                openapi_client.models.mod_forum_get_discussion_posts_200_response_posts_inner.mod_forum_get_discussion_posts_200_response_posts_inner(
                                    attachments = [
                                        openapi_client.models.mod_forum_get_discussion_post_200_response_post_attachments_inner.mod_forum_get_discussion_post_200_response_post_attachments_inner(
                                            author = '', 
                                            component = '', 
                                            contextid = 56, 
                                            filearea = '', 
                                            filename = '', 
                                            filenameshort = '', 
                                            filepath = '', 
                                            filesize = 56, 
                                            filesizeformatted = '', 
                                            html = openapi_client.models.mod_forum_get_discussion_post_200_response_post_attachments_inner_html.mod_forum_get_discussion_post_200_response_post_attachments_inner_html(
                                                plagiarism = '', ), 
                                            icon = '', 
                                            isdir = True, 
                                            isimage = True, 
                                            itemid = 56, 
                                            license = '', 
                                            timecreated = 56, 
                                            timecreatedformatted = '', 
                                            timemodified = 56, 
                                            timemodifiedformatted = '', 
                                            url = '', 
                                            urls = openapi_client.models.mod_forum_get_discussion_post_200_response_post_attachments_inner_urls.mod_forum_get_discussion_post_200_response_post_attachments_inner_urls(
                                                export = '', ), )
                                        ], 
                                    author = openapi_client.models.mod_forum_get_discussion_post_200_response_post_author.mod_forum_get_discussion_post_200_response_post_author(
                                        fullname = '', 
                                        groups = [
                                            openapi_client.models.mod_forum_get_discussion_post_200_response_post_author_groups_inner.mod_forum_get_discussion_post_200_response_post_author_groups_inner(
                                                id = 56, 
                                                name = '', )
                                            ], 
                                        id = 56, 
                                        isdeleted = True, 
                                        urls = openapi_client.models.mod_forum_get_discussion_post_200_response_post_author_urls.mod_forum_get_discussion_post_200_response_post_author_urls(
                                            profile = '', 
                                            profileimage = '', ), ), 
                                    capabilities = openapi_client.models.mod_forum_get_discussion_post_200_response_post_capabilities.mod_forum_get_discussion_post_200_response_post_capabilities(
                                        canreplyprivately = True, 
                                        controlreadstatus = True, 
                                        delete = True, 
                                        edit = True, 
                                        export = True, 
                                        reply = True, 
                                        selfenrol = True, 
                                        split = True, 
                                        view = True, ), 
                                    charcount = 56, 
                                    discussionid = 56, 
                                    hasparent = True, 
                                    haswordcount = True, 
                                    html = openapi_client.models.mod_forum_get_discussion_post_200_response_post_html.mod_forum_get_discussion_post_200_response_post_html(
                                        authorsubheading = '', 
                                        rating = '', 
                                        taglist = '', ), 
                                    id = 56, 
                                    isdeleted = True, 
                                    isprivatereply = True, 
                                    message = '', 
                                    messageformat = 56, 
                                    messageinlinefiles = [
                                        openapi_client.models.mod_feedback_get_analysis_200_response_itemsdata_inner_item_itemfiles_inner.mod_feedback_get_analysis_200_response_itemsdata_inner_item_itemfiles_inner(
                                            component = '', 
                                            contextid = 56, 
                                            filearea = '', 
                                            filename = '', 
                                            filenameshort = '', 
                                            filepath = '', 
                                            filesize = 56, 
                                            filesizeformatted = '', 
                                            icon = '', 
                                            isdir = True, 
                                            isimage = True, 
                                            itemid = 56, 
                                            license = '', 
                                            timecreated = 56, 
                                            timecreatedformatted = '', 
                                            timemodified = 56, 
                                            timemodifiedformatted = '', 
                                            url = '', )
                                        ], 
                                    parentid = 56, 
                                    replysubject = '', 
                                    subject = '', 
                                    tags = [
                                        openapi_client.models.mod_forum_get_discussion_post_200_response_post_tags_inner.mod_forum_get_discussion_post_200_response_post_tags_inner(
                                            displayname = '', 
                                            flag = True, 
                                            id = 56, 
                                            isstandard = True, 
                                            tagid = 56, )
                                        ], 
                                    timecreated = 56, 
                                    timemodified = 56, 
                                    unread = True, 
                                    urls = openapi_client.models.mod_forum_get_discussion_post_200_response_post_urls.mod_forum_get_discussion_post_200_response_post_urls(
                                        delete = '', 
                                        discuss = '', 
                                        edit = '', 
                                        export = '', 
                                        markasread = '', 
                                        markasunread = '', 
                                        reply = '', 
                                        split = '', 
                                        view = '', 
                                        viewisolated = '', 
                                        viewparent = '', ), 
                                    wordcount = 56, )
                                ], 
                            userposts = [
                                openapi_client.models.mod_forum_get_discussion_posts_200_response_posts_inner.mod_forum_get_discussion_posts_200_response_posts_inner(
                                    charcount = 56, 
                                    discussionid = 56, 
                                    hasparent = True, 
                                    haswordcount = True, 
                                    id = 56, 
                                    isdeleted = True, 
                                    isprivatereply = True, 
                                    message = '', 
                                    messageformat = 56, 
                                    parentid = 56, 
                                    replysubject = '', 
                                    subject = '', 
                                    timecreated = 56, 
                                    timemodified = 56, 
                                    unread = True, 
                                    wordcount = 56, )
                                ], ), 
                        timecreated = 56, )
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
            return ModForumGetDiscussionPostsByUserid200Response(
                discussions = [
                    openapi_client.models.mod_forum_get_discussion_posts_by_userid_200_response_discussions_inner.mod_forum_get_discussion_posts_by_userid_200_response_discussions_inner(
                        authorfullname = 'null', 
                        id = 56, 
                        name = 'null', 
                        posts = openapi_client.models.mod_forum_get_discussion_posts_by_userid_200_response_discussions_inner_posts.mod_forum_get_discussion_posts_by_userid_200_response_discussions_inner_posts(
                            parentposts = [
                                openapi_client.models.mod_forum_get_discussion_posts_200_response_posts_inner.mod_forum_get_discussion_posts_200_response_posts_inner(
                                    attachments = [
                                        openapi_client.models.mod_forum_get_discussion_post_200_response_post_attachments_inner.mod_forum_get_discussion_post_200_response_post_attachments_inner(
                                            author = '', 
                                            component = '', 
                                            contextid = 56, 
                                            filearea = '', 
                                            filename = '', 
                                            filenameshort = '', 
                                            filepath = '', 
                                            filesize = 56, 
                                            filesizeformatted = '', 
                                            html = openapi_client.models.mod_forum_get_discussion_post_200_response_post_attachments_inner_html.mod_forum_get_discussion_post_200_response_post_attachments_inner_html(
                                                plagiarism = '', ), 
                                            icon = '', 
                                            isdir = True, 
                                            isimage = True, 
                                            itemid = 56, 
                                            license = '', 
                                            timecreated = 56, 
                                            timecreatedformatted = '', 
                                            timemodified = 56, 
                                            timemodifiedformatted = '', 
                                            url = '', 
                                            urls = openapi_client.models.mod_forum_get_discussion_post_200_response_post_attachments_inner_urls.mod_forum_get_discussion_post_200_response_post_attachments_inner_urls(
                                                export = '', ), )
                                        ], 
                                    author = openapi_client.models.mod_forum_get_discussion_post_200_response_post_author.mod_forum_get_discussion_post_200_response_post_author(
                                        fullname = '', 
                                        groups = [
                                            openapi_client.models.mod_forum_get_discussion_post_200_response_post_author_groups_inner.mod_forum_get_discussion_post_200_response_post_author_groups_inner(
                                                id = 56, 
                                                name = '', )
                                            ], 
                                        id = 56, 
                                        isdeleted = True, 
                                        urls = openapi_client.models.mod_forum_get_discussion_post_200_response_post_author_urls.mod_forum_get_discussion_post_200_response_post_author_urls(
                                            profile = '', 
                                            profileimage = '', ), ), 
                                    capabilities = openapi_client.models.mod_forum_get_discussion_post_200_response_post_capabilities.mod_forum_get_discussion_post_200_response_post_capabilities(
                                        canreplyprivately = True, 
                                        controlreadstatus = True, 
                                        delete = True, 
                                        edit = True, 
                                        export = True, 
                                        reply = True, 
                                        selfenrol = True, 
                                        split = True, 
                                        view = True, ), 
                                    charcount = 56, 
                                    discussionid = 56, 
                                    hasparent = True, 
                                    haswordcount = True, 
                                    html = openapi_client.models.mod_forum_get_discussion_post_200_response_post_html.mod_forum_get_discussion_post_200_response_post_html(
                                        authorsubheading = '', 
                                        rating = '', 
                                        taglist = '', ), 
                                    id = 56, 
                                    isdeleted = True, 
                                    isprivatereply = True, 
                                    message = '', 
                                    messageformat = 56, 
                                    messageinlinefiles = [
                                        openapi_client.models.mod_feedback_get_analysis_200_response_itemsdata_inner_item_itemfiles_inner.mod_feedback_get_analysis_200_response_itemsdata_inner_item_itemfiles_inner(
                                            component = '', 
                                            contextid = 56, 
                                            filearea = '', 
                                            filename = '', 
                                            filenameshort = '', 
                                            filepath = '', 
                                            filesize = 56, 
                                            filesizeformatted = '', 
                                            icon = '', 
                                            isdir = True, 
                                            isimage = True, 
                                            itemid = 56, 
                                            license = '', 
                                            timecreated = 56, 
                                            timecreatedformatted = '', 
                                            timemodified = 56, 
                                            timemodifiedformatted = '', 
                                            url = '', )
                                        ], 
                                    parentid = 56, 
                                    replysubject = '', 
                                    subject = '', 
                                    tags = [
                                        openapi_client.models.mod_forum_get_discussion_post_200_response_post_tags_inner.mod_forum_get_discussion_post_200_response_post_tags_inner(
                                            displayname = '', 
                                            flag = True, 
                                            id = 56, 
                                            isstandard = True, 
                                            tagid = 56, )
                                        ], 
                                    timecreated = 56, 
                                    timemodified = 56, 
                                    unread = True, 
                                    urls = openapi_client.models.mod_forum_get_discussion_post_200_response_post_urls.mod_forum_get_discussion_post_200_response_post_urls(
                                        delete = '', 
                                        discuss = '', 
                                        edit = '', 
                                        export = '', 
                                        markasread = '', 
                                        markasunread = '', 
                                        reply = '', 
                                        split = '', 
                                        view = '', 
                                        viewisolated = '', 
                                        viewparent = '', ), 
                                    wordcount = 56, )
                                ], 
                            userposts = [
                                openapi_client.models.mod_forum_get_discussion_posts_200_response_posts_inner.mod_forum_get_discussion_posts_200_response_posts_inner(
                                    charcount = 56, 
                                    discussionid = 56, 
                                    hasparent = True, 
                                    haswordcount = True, 
                                    id = 56, 
                                    isdeleted = True, 
                                    isprivatereply = True, 
                                    message = '', 
                                    messageformat = 56, 
                                    parentid = 56, 
                                    replysubject = '', 
                                    subject = '', 
                                    timecreated = 56, 
                                    timemodified = 56, 
                                    unread = True, 
                                    wordcount = 56, )
                                ], ), 
                        timecreated = 56, )
                    ],
        )
        """

    def testModForumGetDiscussionPostsByUserid200Response(self):
        """Test ModForumGetDiscussionPostsByUserid200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
