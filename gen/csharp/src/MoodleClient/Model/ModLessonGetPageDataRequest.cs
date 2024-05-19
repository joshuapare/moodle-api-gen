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
    /// ModLessonGetPageDataRequest
    /// </summary>
    [DataContract(Name = "mod_lesson_get_page_data_request")]
    public partial class ModLessonGetPageDataRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetPageDataRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLessonGetPageDataRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetPageDataRequest" /> class.
        /// </summary>
        /// <param name="lessonid">lesson instance id (required).</param>
        /// <param name="pageid">the page id (required) (default to null).</param>
        /// <param name="password">optional password (the lesson may be protected) (default to &quot;&quot;).</param>
        /// <param name="returncontents">if we must return the complete page contents once rendered (default to false).</param>
        /// <param name="review">if we want to review just after finishing (1 hour margin) (default to false).</param>
        public ModLessonGetPageDataRequest(int lessonid = default(int), int pageid = null, string password = @"", bool returncontents = false, bool review = false)
        {
            this.Lessonid = lessonid;
            this.Pageid = pageid;
            // use default value if no "password" provided
            this.Password = password ?? @"";
            this.Returncontents = returncontents;
            this.Review = review;
        }

        /// <summary>
        /// lesson instance id
        /// </summary>
        /// <value>lesson instance id</value>
        [DataMember(Name = "lessonid", IsRequired = true, EmitDefaultValue = true)]
        public int Lessonid { get; set; }

        /// <summary>
        /// the page id
        /// </summary>
        /// <value>the page id</value>
        [DataMember(Name = "pageid", IsRequired = true, EmitDefaultValue = true)]
        public int Pageid { get; set; }

        /// <summary>
        /// optional password (the lesson may be protected)
        /// </summary>
        /// <value>optional password (the lesson may be protected)</value>
        [DataMember(Name = "password", EmitDefaultValue = false)]
        public string Password { get; set; }

        /// <summary>
        /// if we must return the complete page contents once rendered
        /// </summary>
        /// <value>if we must return the complete page contents once rendered</value>
        [DataMember(Name = "returncontents", EmitDefaultValue = true)]
        public bool Returncontents { get; set; }

        /// <summary>
        /// if we want to review just after finishing (1 hour margin)
        /// </summary>
        /// <value>if we want to review just after finishing (1 hour margin)</value>
        [DataMember(Name = "review", EmitDefaultValue = true)]
        public bool Review { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonGetPageDataRequest {\n");
            sb.Append("  Lessonid: ").Append(Lessonid).Append("\n");
            sb.Append("  Pageid: ").Append(Pageid).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Returncontents: ").Append(Returncontents).Append("\n");
            sb.Append("  Review: ").Append(Review).Append("\n");
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