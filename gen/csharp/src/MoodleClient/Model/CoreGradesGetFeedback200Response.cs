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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreGradesGetFeedback200Response
    /// </summary>
    [DataContract(Name = "core_grades_get_feedback_200_response")]
    public partial class CoreGradesGetFeedback200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGetFeedback200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreGradesGetFeedback200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesGetFeedback200Response" /> class.
        /// </summary>
        /// <param name="additionalfield">Additional field for the user (email or ID number, for example) (required) (default to &quot;null&quot;).</param>
        /// <param name="feedbacktext">The full feedback text (required) (default to &quot;null&quot;).</param>
        /// <param name="fullname">Students name (required) (default to &quot;null&quot;).</param>
        /// <param name="picture">Students picture (required) (default to &quot;null&quot;).</param>
        /// <param name="title">Title of the grade item that the feedback is for (required) (default to &quot;null&quot;).</param>
        public CoreGradesGetFeedback200Response(string additionalfield = @"null", string feedbacktext = @"null", string fullname = @"null", string picture = @"null", string title = @"null")
        {
            // to ensure "additionalfield" is required (not null)
            if (additionalfield == null)
            {
                throw new ArgumentNullException("additionalfield is a required property for CoreGradesGetFeedback200Response and cannot be null");
            }
            this.Additionalfield = additionalfield;
            // to ensure "feedbacktext" is required (not null)
            if (feedbacktext == null)
            {
                throw new ArgumentNullException("feedbacktext is a required property for CoreGradesGetFeedback200Response and cannot be null");
            }
            this.Feedbacktext = feedbacktext;
            // to ensure "fullname" is required (not null)
            if (fullname == null)
            {
                throw new ArgumentNullException("fullname is a required property for CoreGradesGetFeedback200Response and cannot be null");
            }
            this.Fullname = fullname;
            // to ensure "picture" is required (not null)
            if (picture == null)
            {
                throw new ArgumentNullException("picture is a required property for CoreGradesGetFeedback200Response and cannot be null");
            }
            this.Picture = picture;
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new ArgumentNullException("title is a required property for CoreGradesGetFeedback200Response and cannot be null");
            }
            this.Title = title;
        }

        /// <summary>
        /// Additional field for the user (email or ID number, for example)
        /// </summary>
        /// <value>Additional field for the user (email or ID number, for example)</value>
        [DataMember(Name = "additionalfield", IsRequired = true, EmitDefaultValue = true)]
        public string Additionalfield { get; set; }

        /// <summary>
        /// The full feedback text
        /// </summary>
        /// <value>The full feedback text</value>
        [DataMember(Name = "feedbacktext", IsRequired = true, EmitDefaultValue = true)]
        public string Feedbacktext { get; set; }

        /// <summary>
        /// Students name
        /// </summary>
        /// <value>Students name</value>
        [DataMember(Name = "fullname", IsRequired = true, EmitDefaultValue = true)]
        public string Fullname { get; set; }

        /// <summary>
        /// Students picture
        /// </summary>
        /// <value>Students picture</value>
        [DataMember(Name = "picture", IsRequired = true, EmitDefaultValue = true)]
        public string Picture { get; set; }

        /// <summary>
        /// Title of the grade item that the feedback is for
        /// </summary>
        /// <value>Title of the grade item that the feedback is for</value>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradesGetFeedback200Response {\n");
            sb.Append("  Additionalfield: ").Append(Additionalfield).Append("\n");
            sb.Append("  Feedbacktext: ").Append(Feedbacktext).Append("\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Picture: ").Append(Picture).Append("\n");
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