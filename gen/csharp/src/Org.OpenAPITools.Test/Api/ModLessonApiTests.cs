/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing ModLessonApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ModLessonApiTests : IDisposable
    {
        private ModLessonApi instance;

        public ModLessonApiTests()
        {
            instance = new ModLessonApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ModLessonApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ModLessonApi
            //Assert.IsType<ModLessonApi>(instance);
        }

        /// <summary>
        /// Test ModLessonFinishAttempt
        /// </summary>
        [Fact]
        public void ModLessonFinishAttemptTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonFinishAttemptRequest modLessonFinishAttemptRequest = null;
            //var response = instance.ModLessonFinishAttempt(modLessonFinishAttemptRequest);
            //Assert.IsType<ModLessonFinishAttempt200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetAttemptsOverview
        /// </summary>
        [Fact]
        public void ModLessonGetAttemptsOverviewTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetAttemptsOverviewRequest modLessonGetAttemptsOverviewRequest = null;
            //var response = instance.ModLessonGetAttemptsOverview(modLessonGetAttemptsOverviewRequest);
            //Assert.IsType<ModLessonGetAttemptsOverview200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetContentPagesViewed
        /// </summary>
        [Fact]
        public void ModLessonGetContentPagesViewedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetContentPagesViewedRequest modLessonGetContentPagesViewedRequest = null;
            //var response = instance.ModLessonGetContentPagesViewed(modLessonGetContentPagesViewedRequest);
            //Assert.IsType<ModLessonGetContentPagesViewed200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetLesson
        /// </summary>
        [Fact]
        public void ModLessonGetLessonTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetLessonRequest modLessonGetLessonRequest = null;
            //var response = instance.ModLessonGetLesson(modLessonGetLessonRequest);
            //Assert.IsType<ModLessonGetLesson200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetLessonAccessInformation
        /// </summary>
        [Fact]
        public void ModLessonGetLessonAccessInformationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetLessonAccessInformationRequest modLessonGetLessonAccessInformationRequest = null;
            //var response = instance.ModLessonGetLessonAccessInformation(modLessonGetLessonAccessInformationRequest);
            //Assert.IsType<ModLessonGetLessonAccessInformation200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetLessonsByCourses
        /// </summary>
        [Fact]
        public void ModLessonGetLessonsByCoursesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = null;
            //var response = instance.ModLessonGetLessonsByCourses(modChatGetChatsByCoursesRequest);
            //Assert.IsType<ModLessonGetLessonsByCourses200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetPageData
        /// </summary>
        [Fact]
        public void ModLessonGetPageDataTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetPageDataRequest modLessonGetPageDataRequest = null;
            //var response = instance.ModLessonGetPageData(modLessonGetPageDataRequest);
            //Assert.IsType<ModLessonGetPageData200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetPages
        /// </summary>
        [Fact]
        public void ModLessonGetPagesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetPagesRequest modLessonGetPagesRequest = null;
            //var response = instance.ModLessonGetPages(modLessonGetPagesRequest);
            //Assert.IsType<ModLessonGetPages200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetPagesPossibleJumps
        /// </summary>
        [Fact]
        public void ModLessonGetPagesPossibleJumpsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetLessonAccessInformationRequest modLessonGetLessonAccessInformationRequest = null;
            //var response = instance.ModLessonGetPagesPossibleJumps(modLessonGetLessonAccessInformationRequest);
            //Assert.IsType<ModLessonGetPagesPossibleJumps200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetQuestionsAttempts
        /// </summary>
        [Fact]
        public void ModLessonGetQuestionsAttemptsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetQuestionsAttemptsRequest modLessonGetQuestionsAttemptsRequest = null;
            //var response = instance.ModLessonGetQuestionsAttempts(modLessonGetQuestionsAttemptsRequest);
            //Assert.IsType<ModLessonGetQuestionsAttempts200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetUserAttempt
        /// </summary>
        [Fact]
        public void ModLessonGetUserAttemptTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetUserAttemptRequest modLessonGetUserAttemptRequest = null;
            //var response = instance.ModLessonGetUserAttempt(modLessonGetUserAttemptRequest);
            //Assert.IsType<ModLessonGetUserAttempt200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetUserAttemptGrade
        /// </summary>
        [Fact]
        public void ModLessonGetUserAttemptGradeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetUserAttemptGradeRequest modLessonGetUserAttemptGradeRequest = null;
            //var response = instance.ModLessonGetUserAttemptGrade(modLessonGetUserAttemptGradeRequest);
            //Assert.IsType<ModLessonGetUserAttemptGrade200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetUserGrade
        /// </summary>
        [Fact]
        public void ModLessonGetUserGradeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetUserGradeRequest modLessonGetUserGradeRequest = null;
            //var response = instance.ModLessonGetUserGrade(modLessonGetUserGradeRequest);
            //Assert.IsType<ModLessonGetUserGrade200Response>(response);
        }

        /// <summary>
        /// Test ModLessonGetUserTimers
        /// </summary>
        [Fact]
        public void ModLessonGetUserTimersTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetUserGradeRequest modLessonGetUserGradeRequest = null;
            //var response = instance.ModLessonGetUserTimers(modLessonGetUserGradeRequest);
            //Assert.IsType<ModLessonGetUserTimers200Response>(response);
        }

        /// <summary>
        /// Test ModLessonLaunchAttempt
        /// </summary>
        [Fact]
        public void ModLessonLaunchAttemptTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonLaunchAttemptRequest modLessonLaunchAttemptRequest = null;
            //var response = instance.ModLessonLaunchAttempt(modLessonLaunchAttemptRequest);
            //Assert.IsType<ModLessonLaunchAttempt200Response>(response);
        }

        /// <summary>
        /// Test ModLessonProcessPage
        /// </summary>
        [Fact]
        public void ModLessonProcessPageTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonProcessPageRequest modLessonProcessPageRequest = null;
            //var response = instance.ModLessonProcessPage(modLessonProcessPageRequest);
            //Assert.IsType<ModLessonProcessPage200Response>(response);
        }

        /// <summary>
        /// Test ModLessonViewLesson
        /// </summary>
        [Fact]
        public void ModLessonViewLessonTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLessonGetLessonRequest modLessonGetLessonRequest = null;
            //var response = instance.ModLessonViewLesson(modLessonGetLessonRequest);
            //Assert.IsType<CoreCalendarDeleteSubscription200Response>(response);
        }
    }
}
