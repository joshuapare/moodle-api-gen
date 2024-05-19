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
    /// CoreCourseToggleActivityRecommendation200Response
    /// </summary>
    [DataContract(Name = "core_course_toggle_activity_recommendation_200_response")]
    public partial class CoreCourseToggleActivityRecommendation200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseToggleActivityRecommendation200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseToggleActivityRecommendation200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseToggleActivityRecommendation200Response" /> class.
        /// </summary>
        /// <param name="area">The favourite area (itemtype) (required).</param>
        /// <param name="id">id of the activity or whatever (required).</param>
        /// <param name="status">If created or deleted (required) (default to null).</param>
        public CoreCourseToggleActivityRecommendation200Response(string area = default(string), int id = default(int), bool status = null)
        {
            // to ensure "area" is required (not null)
            if (area == null)
            {
                throw new ArgumentNullException("area is a required property for CoreCourseToggleActivityRecommendation200Response and cannot be null");
            }
            this.Area = area;
            this.Id = id;
            this.Status = status;
        }

        /// <summary>
        /// The favourite area (itemtype)
        /// </summary>
        /// <value>The favourite area (itemtype)</value>
        [DataMember(Name = "area", IsRequired = true, EmitDefaultValue = true)]
        public string Area { get; set; }

        /// <summary>
        /// id of the activity or whatever
        /// </summary>
        /// <value>id of the activity or whatever</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// If created or deleted
        /// </summary>
        /// <value>If created or deleted</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public bool Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseToggleActivityRecommendation200Response {\n");
            sb.Append("  Area: ").Append(Area).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
