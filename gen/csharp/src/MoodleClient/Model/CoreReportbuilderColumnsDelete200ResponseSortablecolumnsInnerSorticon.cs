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
    /// CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon
    /// </summary>
    [DataContract(Name = "core_reportbuilder_columns_delete_200_response_sortablecolumns_inner_sorticon")]
    public partial class CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon" /> class.
        /// </summary>
        /// <param name="component">component (required).</param>
        /// <param name="key">key (required).</param>
        /// <param name="title">title (required).</param>
        public CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon(string component = default(string), string key = default(string), string title = default(string))
        {
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon and cannot be null");
            }
            this.Component = component;
            // to ensure "key" is required (not null)
            if (key == null)
            {
                throw new ArgumentNullException("key is a required property for CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon and cannot be null");
            }
            this.Key = key;
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new ArgumentNullException("title is a required property for CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon and cannot be null");
            }
            this.Title = title;
        }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// key
        /// </summary>
        /// <value>key</value>
        [DataMember(Name = "key", IsRequired = true, EmitDefaultValue = true)]
        public string Key { get; set; }

        /// <summary>
        /// title
        /// </summary>
        /// <value>title</value>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon {\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
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
