/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ModLessonGetUserAttempt200ResponseAnswerpagesInner
    /// </summary>
    [DataContract(Name = "mod_lesson_get_user_attempt_200_response_answerpages_inner")]
    public partial class ModLessonGetUserAttempt200ResponseAnswerpagesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetUserAttempt200ResponseAnswerpagesInner" /> class.
        /// </summary>
        /// <param name="answerdata">answerdata.</param>
        /// <param name="contents">Page contents. (default to &quot;null&quot;).</param>
        /// <param name="grayout">If is required to apply a grayout. (default to null).</param>
        /// <param name="page">page.</param>
        /// <param name="qtype">Identifies the page type of this page. (default to &quot;null&quot;).</param>
        /// <param name="title">Page title. (default to &quot;null&quot;).</param>
        public ModLessonGetUserAttempt200ResponseAnswerpagesInner(ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata answerdata = default(ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata), string contents = @"null", int grayout = null, ModLessonGetPages200ResponsePagesInnerPage page = default(ModLessonGetPages200ResponsePagesInnerPage), string qtype = @"null", string title = @"null")
        {
            this.Answerdata = answerdata;
            // use default value if no "contents" provided
            this.Contents = contents ?? @"null";
            this.Grayout = grayout;
            this.Page = page;
            // use default value if no "qtype" provided
            this.Qtype = qtype ?? @"null";
            // use default value if no "title" provided
            this.Title = title ?? @"null";
        }

        /// <summary>
        /// Gets or Sets Answerdata
        /// </summary>
        [DataMember(Name = "answerdata", EmitDefaultValue = false)]
        public ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata Answerdata { get; set; }

        /// <summary>
        /// Page contents.
        /// </summary>
        /// <value>Page contents.</value>
        [DataMember(Name = "contents", EmitDefaultValue = false)]
        public string Contents { get; set; }

        /// <summary>
        /// If is required to apply a grayout.
        /// </summary>
        /// <value>If is required to apply a grayout.</value>
        [DataMember(Name = "grayout", EmitDefaultValue = false)]
        public int Grayout { get; set; }

        /// <summary>
        /// Gets or Sets Page
        /// </summary>
        [DataMember(Name = "page", EmitDefaultValue = false)]
        public ModLessonGetPages200ResponsePagesInnerPage Page { get; set; }

        /// <summary>
        /// Identifies the page type of this page.
        /// </summary>
        /// <value>Identifies the page type of this page.</value>
        [DataMember(Name = "qtype", EmitDefaultValue = false)]
        public string Qtype { get; set; }

        /// <summary>
        /// Page title.
        /// </summary>
        /// <value>Page title.</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonGetUserAttempt200ResponseAnswerpagesInner {\n");
            sb.Append("  Answerdata: ").Append(Answerdata).Append("\n");
            sb.Append("  Contents: ").Append(Contents).Append("\n");
            sb.Append("  Grayout: ").Append(Grayout).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  Qtype: ").Append(Qtype).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
