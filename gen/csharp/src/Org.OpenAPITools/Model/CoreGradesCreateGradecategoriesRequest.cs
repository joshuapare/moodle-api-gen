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
    /// CoreGradesCreateGradecategoriesRequest
    /// </summary>
    [DataContract(Name = "core_grades_create_gradecategories_request")]
    public partial class CoreGradesCreateGradecategoriesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesCreateGradecategoriesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreGradesCreateGradecategoriesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradesCreateGradecategoriesRequest" /> class.
        /// </summary>
        /// <param name="categories">categories (required).</param>
        /// <param name="courseid">id of course (required) (default to null).</param>
        public CoreGradesCreateGradecategoriesRequest(List<CoreGradesCreateGradecategoriesRequestCategoriesInner> categories = default(List<CoreGradesCreateGradecategoriesRequestCategoriesInner>), int courseid = null)
        {
            // to ensure "categories" is required (not null)
            if (categories == null)
            {
                throw new ArgumentNullException("categories is a required property for CoreGradesCreateGradecategoriesRequest and cannot be null");
            }
            this.Categories = categories;
            this.Courseid = courseid;
        }

        /// <summary>
        /// Gets or Sets Categories
        /// </summary>
        [DataMember(Name = "categories", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreGradesCreateGradecategoriesRequestCategoriesInner> Categories { get; set; }

        /// <summary>
        /// id of course
        /// </summary>
        /// <value>id of course</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradesCreateGradecategoriesRequest {\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
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