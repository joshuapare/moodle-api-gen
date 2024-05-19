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
    /// GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
    /// </summary>
    [DataContract(Name = "gradereport_user_get_grades_table_200_response_tables_inner_tabledata_inner_contributiontocoursetotal")]
    public partial class GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal" /> class.
        /// </summary>
        /// <param name="varClass">class (required).</param>
        /// <param name="content">cell content (required).</param>
        /// <param name="headers">headers (required).</param>
        public GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal(string varClass = default(string), string content = default(string), string headers = default(string))
        {
            // to ensure "varClass" is required (not null)
            if (varClass == null)
            {
                throw new ArgumentNullException("varClass is a required property for GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal and cannot be null");
            }
            this.Class = varClass;
            // to ensure "content" is required (not null)
            if (content == null)
            {
                throw new ArgumentNullException("content is a required property for GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal and cannot be null");
            }
            this.Content = content;
            // to ensure "headers" is required (not null)
            if (headers == null)
            {
                throw new ArgumentNullException("headers is a required property for GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal and cannot be null");
            }
            this.Headers = headers;
        }

        /// <summary>
        /// class
        /// </summary>
        /// <value>class</value>
        [DataMember(Name = "class", IsRequired = true, EmitDefaultValue = true)]
        public string Class { get; set; }

        /// <summary>
        /// cell content
        /// </summary>
        /// <value>cell content</value>
        [DataMember(Name = "content", IsRequired = true, EmitDefaultValue = true)]
        public string Content { get; set; }

        /// <summary>
        /// headers
        /// </summary>
        /// <value>headers</value>
        [DataMember(Name = "headers", IsRequired = true, EmitDefaultValue = true)]
        public string Headers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal {\n");
            sb.Append("  Class: ").Append(Class).Append("\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Headers: ").Append(Headers).Append("\n");
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